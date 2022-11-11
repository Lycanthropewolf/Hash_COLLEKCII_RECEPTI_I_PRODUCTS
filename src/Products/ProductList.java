package Products;

import java.util.HashSet;

public class ProductList {


    public static HashSet<Product> productsList = new HashSet<>();

    public static void printListOfProduct() {
        System.out.println(productsList);
    }

    public static void addProductToList(Product newProduct) {
        if (!productsList.contains(newProduct)) {
            productsList.add(newProduct);
        } else {
            throw new RuntimeException(" Такой продукт уже есть ");
        }
    }

    public static boolean removeProductOnList(Product removeProduct) {
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.contains(removeProduct)) {
                productsList.remove(removeProduct);
                System.out.println(removeProduct.getName() + " удален из множества");
                return true;
            }
        }
        System.out.println(" Продукт " + removeProduct.getName() + " не найден в множестве");
        return false;
    }

    public static boolean checkProductInList(Product checkProducts) {
        for (Product products : productsList) {
            if (products.equals(checkProducts)) {
                System.out.println(checkProducts.getName() + " уже куплен!");
                return false;
            }
        }
        System.out.println(checkProducts.getName() + " еще не куплен");
        return true;
    }


    public static HashSet<Product> getProductsList() {
        return productsList;
    }

}
