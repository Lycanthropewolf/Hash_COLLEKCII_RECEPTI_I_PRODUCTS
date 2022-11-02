package Recipes;

import  java.util.HashSet;
import  java.util.Set;

public class RecipeCollection {
    public static Set<Recipes> recipes = new HashSet<>();

    public static void addRecipe(Recipes recipe) {
        for (var recipeInCollection: recipes){
            if (recipeInCollection.getNameOfRecipe().equals(recipe.getNameOfRecipe())){
                throw new RuntimeException(" Такой рецепт есть");
            }
        }
        recipes.add(recipe);
    }
    public static void printAllRecipes(){
        System.out.println(recipes);
    }

    /*public static void printAllRecipes() {
        System.out.println(" Книга рецептов");
        for (Recipes recipe : recipes) {
            System.out.println(recipe.getNameOfRecipe()+" : ");
            for (Map.Entry<Products, integer>entry: recipe.getProducts().entrySet()){
                System.out.println(entry.getKey()+" - "+entry.getValue()+ " кг, ");
            }
            System.out.println(" Общая стоимость продуктов "+ recipe.getTotalCostRecipe()+" рублей");
        }
    }*/

}
