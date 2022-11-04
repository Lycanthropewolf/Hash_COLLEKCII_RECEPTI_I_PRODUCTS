package Products;

import java.util.ArrayList;
import java.util.List;

public class ProductsList {


    public static List<Products> productsList = new ArrayList<>();

    public static void printListOfProduct() {
        System.out.println(productsList);
    }

    public static void addProductToList(Products newProduct) {
        if (!productsList.contains(newProduct)) {
            productsList.add(newProduct);
        } else {
            throw new RuntimeException(" Такой продукт уже есть ");
        }
    }

    public static boolean removeProductOnList(Products removeProducts) {
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).equals(removeProducts)) {
                productsList.remove(i);
                System.out.println(removeProducts.getName() + " удален из множества");
                return true;
            }
        }
        System.out.println(" Продукт " + removeProducts.getName() + " не найден в множестве");
        return false;
    }

    public static boolean checkProductInList(Products checkProducts) {
        for (Products products : productsList) {
            if (products.equals(checkProducts)) {
                System.out.println(checkProducts.getName() + " уже куплен!");
                return false;
            }
        }
        System.out.println(checkProducts.getName() + " еще не куплен");
        return true;
    }


    public static List<Products> getProductsList() {
        return productsList;
    }

}
