package tests.classwork.day21;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbProperties {
    private static final Properties PROP = getProperties();

    public static void main(String[] args) {
        //PROP.forEach((k, v) -> System.out.println(v.toString()));
        //String query = "SHOW TABLES";
        //execStatement(query);

        //String query = "SELECT * FROM Categories Where CategoryID = ?";

        //execParametrizedStatement(query, 2);

        loadCategories();


    }

    private static Properties getProperties() {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("src/test/resources/db.properties")) {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    private static MysqlDataSource getDataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName(PROP.getProperty("HOST"));
        dataSource.setPort(Integer.parseInt(PROP.getProperty("PORT")));
        dataSource.setUser(PROP.getProperty("USER"));
        dataSource.setPassword(PROP.getProperty("PWD"));
        dataSource.setDatabaseName(PROP.getProperty("DBNAME"));
        return dataSource;
    }

    private static void execStatement(String query) {
        try (Connection connection = getDataSource().getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void execParametrizedStatement(String query, int id) {

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query);) {
            statement.setInt(1, id);

            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString(2));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void loadCategories() {
        String query = "SELECT * FROM Categories";
        List<Category> categories = new ArrayList<>();

        try (Connection connection = getDataSource().getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            while (rs.next()) {
                categories.add(new Category(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        categories.forEach(category -> System.out.println(category.toString()));
    }
}
