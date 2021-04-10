package webd4201.sturchflintn;

public class Main {

    public static void main(String[] args)
    {
        String name = "Mashed Potatoes";
        String[] ingredients = {"Potatoes", "Salt", "Water"};
        String[] directions = {"Bring water to a boil, add the salt", "Cut the potatoes to the desired size", "Boil the potatoes until no resistance on a knife poke"};
        int servings = 4;
	    recipes newRecipe = new recipes(name, ingredients, directions, servings);


	    System.out.println(newRecipe.toString());
    }
}
