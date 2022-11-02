package Recipes;

import Products.Products;

import java.util.*;

public class Recipes {
    private String nameOfRecipe;
    private List<Products> products = new ArrayList<Products>();
    private double totalCostRecipe;

    public Recipes(String nameOfRecipe) {
        this.nameOfRecipe = nameOfRecipe;
        this.totalCostRecipe = 0;

    }

    public void addProductInRecipe(Products product, int requiredQuantiti) {
        if (products.contains(product)) {
            throw new RuntimeException(" Продукт уже добавлен в рецепт");
        }
        products.add(product);
        totalCostRecipe = totalCostRecipe + product.getPrice() * requiredQuantiti;
    }

    @Override
    public String toString() {
        return "Рецепт" + nameOfRecipe ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipes)) return false;
        Recipes recipes = (Recipes) o;
        return Double.compare(recipes.totalCostRecipe, totalCostRecipe) == 0 && nameOfRecipe.equals(recipes.nameOfRecipe) && products.equals(recipes.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe, products, totalCostRecipe);
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public List<Products> getProducts() {
        return products;
    }

    public double getTotalCostRecipe() {
        return totalCostRecipe;
    }
}
