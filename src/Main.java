import Products.Products;
import Recipes.Recipes;

import static Products.ProductsList.*;
import static Recipes.RecipeCollection.addRecipe;
import static Recipes.RecipeCollection.printAllRecipes;

public class Main {
    public static void main(String[] args) {
        Recipes recipes1 = new Recipes(" Шарлотка");
        Recipes recipes2 = new Recipes("Борщ");
        Products products1 = new Products("Капуста", 13.99, 5);
        Products products2 = new Products(" картошка", 12.20, 10);
        removeProductOnList("Капуста");
        printListOfProduct();
        checkProductInList(" картошка");
        recipes2.addProductInRecipe(products1, 23);
        recipes2.addProductInRecipe(products2, 14);
        addRecipe(recipes1);
        printAllRecipes();
    }

}