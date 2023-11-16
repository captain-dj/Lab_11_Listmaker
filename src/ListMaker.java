import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {
    private static ArrayList<String> itemList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            displayMenu();
            String choice = getRegExString("[AaDdPpQq]", "Enter your choice: ");
            switch (choice.toUpperCase()) {
                case "A":
                    addItem();
                    break;
                case "D":
                    deleteItem();
                    break;
                case "P":
                    printList();
                    break;
                case "Q":
                    quit = confirmQuit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Other methods here (addItem, deleteItem, printList, confirmQuit, displayMenu, etc.)

    private static void displayMenu() {
        // Display menu options
    }

    private static String getRegExString(String pattern, String message) {
        // Implement SafeInput's getRegExString method
        return null; // Placeholder, replace with actual implementation
    }

    // Other stubbed methods...
}
