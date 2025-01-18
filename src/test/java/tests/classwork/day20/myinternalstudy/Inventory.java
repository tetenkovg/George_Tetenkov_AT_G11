package tests.classwork.day20.myinternalstudy;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(String productName, int quantity) {
        try {
            if (quantity == 0) {
                throw new IllegalArgumentException("Quantity must be positive");
            }
            products.put(productName, products.getOrDefault(productName, 0) + quantity);
        } catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public void removeProduct(String productName, int quantity) {
        if (!products.containsKey(productName)) {
            System.out.println("Product now found.");
        }
        if (quantity <= 0) {
            System.out.println("Quantity must me > 0");

        }

        int currentQuantity = products.get(productName);
        if (currentQuantity < quantity) {
            System.out.println("Not enough quantity");

        } else {
            products.put(productName, currentQuantity - quantity);

            if (products.get(productName) == 0) {
                products.remove(productName);
            }
        }
    }

    public Map<String, Integer> getInventory() {
        return products;
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct("Apple", 1);
        inventory.addProduct("Apple", 1);
        inventory.addProduct("Apple", 1);
        inventory.addProduct("Apple", 1);



        System.out.println(inventory.getInventory());

    }

}
