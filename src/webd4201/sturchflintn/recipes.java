package webd4201.sturchflintn;

public class recipes
{
    private static String recipeName;
    private static String[] ingredients;
    private static String[] directions;
    private static int servings;

    public recipes()
    {

    }

    public recipes(String name, String[] ingredients, String[] directions, int servings)
    {
        setRecipeName(name);
        setIngredients(ingredients);
        setDirections(directions);
        setServings(servings);
    }

    public static String getRecipeName() {
        return recipeName;
    }

    public static void setRecipeName(String recipeName) {
        recipes.recipeName = recipeName;
    }

    public static String[] getIngredients() {
        return ingredients;
    }

    public static void setIngredients(String[] ingredients) {
        recipes.ingredients = ingredients;
    }

    public static String[] getDirections() {
        return directions;
    }

    public static void setDirections(String[] directions) {
        recipes.directions = directions;
    }

    public static int getServings() {
        return servings;
    }

    public static void setServings(int servings) {
        recipes.servings = servings;
    }

    @Override
    public String toString()
    {
        String tempString = "recipe:\n " + getRecipeName() + "\n\nINGREDIENTS : \n";
        for (int i = 0; i < getIngredients().length; i++)
        {
            tempString += i + ")" + getIngredients()[i] + "\n";
        }

        tempString += "\nDIRECTIONS : \n";

        for (int j = 0; j < getDirections().length; j++)
        {
            tempString += j + ")" + getDirections()[j] + "\n";
        }
        tempString += "\nServings : " + getServings();

        return tempString;
    }
}
