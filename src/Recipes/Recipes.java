package Recipes;

import Products.Products;

import java.util.*;

public  class Recipes {
    private String nameOfRecipe;
    private Map<Products,Integer> products = new HashMap<>();


    public Recipes(String nameOfRecipe) {
        this.nameOfRecipe = nameOfRecipe;


    }

    public void addProductInRecipe(Products product, int requiredQuantiti) {
        if (products.containsKey(product)){
            throw new RuntimeException(" Такой продукт есть");
        }else if (requiredQuantiti<1){
            products.put(product,1);
        }else {
            products.put(product,requiredQuantiti);
        }

    }
    public double getCostForProduct(){
        double sum =0;
        for (Products key: products.keySet()){
            sum+=products.get(key)* key.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Рецепт" +" "+ nameOfRecipe ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipes)) return false;
        Recipes recipes = (Recipes) o;
        return nameOfRecipe.equals(recipes.nameOfRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe);
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public Map<Products,Integer> getProducts() {
        return products;
    }

}
