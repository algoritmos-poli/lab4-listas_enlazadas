import java.util.LinkedList;

public class GroceryListManager {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the LinkedList
        LinkedList<String> groceryList = new LinkedList<>();

        // Step 2: Add initial items to the list
        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add("Eggs");
        groceryList.add("Butter");
        groceryList.add("Tomatoes");

        // Step 3: Update the second item (Bread to Whole Wheat Bread)
        groceryList.set(1, "Whole Wheat Bread");

        // Step 4: Remove an item (Butter)
        groceryList.remove("Butter");

        // Step 5: Add another item (Cheese)
        groceryList.add("Cheese");

        // Step 6: Print the final list
        System.out.println("Final Grocery List: " + groceryList);
    }
}
