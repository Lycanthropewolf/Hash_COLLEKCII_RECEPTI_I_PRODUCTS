package Recipes;

import Products.Product;

import java.util.*;

public class Recipe {
    private String nameOfRecipe;
    public static Map<Product, Integer> products = new HashMap<>();

    public static void printRecipe() {
        System.out.println(Recipe.products);
    }
    public Recipe(String nameOfRecipe) {
        this.nameOfRecipe = nameOfRecipe;


    }

    public void addProductInRecipe(Product product, int requiredQuantiti) {
        if (products.containsKey(product)) {
            throw new RuntimeException(" Такой продукт есть");
        } else if (requiredQuantiti <= 0) {
            requiredQuantiti = 1;

        }
            products.put(product, requiredQuantiti);


    }

    public double getCostForRecipe() {
        double sum = 0;
        for (Product key : products.keySet()) {
            sum += products.get(key) * key.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Рецепт" + " " + nameOfRecipe+" "+ products.keySet()+products.values();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return nameOfRecipe.equals(recipe.nameOfRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe);
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }


}
