package homework.day7.utils;

import java.util.Objects;

public class Cities {
    private String name;
    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Cities(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cities cities = (Cities) o;
        return population == cities.population && Objects.equals(name, cities.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }

    @Override
    public String toString() {
        return "Cities{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}