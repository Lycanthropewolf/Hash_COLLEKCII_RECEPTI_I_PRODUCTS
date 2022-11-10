import Products.Product;
import Recipes.Recipe;

import static Products.ProductList.*;
import static Recipes.RecipeCollection.addRecipe;
import static Recipes.RecipeCollection.printAllRecipes;

public class Main {
    public static void main(String[] args) {
        Recipe sharlotka = new Recipe("Шарлотка");
        Recipe borsh = new Recipe("Борщ");
        Product kapusta = new Product("Капуста", 13.99, 5);
        Product kartoha = new Product(" картошка", 12.20, 10);
        addProductToList(kartoha);
        addProductToList(kapusta);
        printListOfProduct();
        removeProductOnList(kapusta);
        printListOfProduct();
        addProductToList(kapusta);
        printListOfProduct();
        checkProductInList(kartoha);
        checkProductInList(kapusta);
        borsh.addProductInRecipe(kapusta, 23);
        borsh.addProductInRecipe(kartoha, -4);
        System.out.println();
        addRecipe(sharlotka);
        addRecipe(borsh);
        printAllRecipes();
        System.out.println(Recipe.products);
        sharlotka.addProductInRecipe(kapusta,-4);;



    }

}