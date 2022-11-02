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

    public static boolean removeProductOnList(String nameToRemove) {
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getName().equals(nameToRemove)) {
                productsList.remove(i);
                System.out.println(nameToRemove + " удален из множества");
                return true;
            }
        }
        System.out.println(" Продукт " + nameToRemove + " не найден в множестве");
        return false;
    }

    public static boolean checkProductInList(String nameToCheck) {
        for (Products products : productsList) {
            if (products.getName().equals(nameToCheck)) {
                System.out.println(nameToCheck + " уже куплен!");
                return false;
            }
        }
        System.out.println(nameToCheck + " еще не куплен");
        return true;
    }


    public static List<Products> getProductsList() {
        return productsList;
    }

}
