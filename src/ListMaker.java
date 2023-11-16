import java.util.ArrayList;

public class ListMaker {
    private static ArrayList<String> myArrList = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            displayMenu();
            String choice = SafeInput.getRegexString("[AaDdPpQq]", "Enter your choice: ");

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
                    running = confirmQuit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("A - Add an item to the list");
        System.out.println("D - Delete an item from the list");
        System.out.println("P - Print the list");
        System.out.println("Q - Quit");

        // Display current list
        System.out.println("Current List:");
        for (int i = 0; i < myArrList.size(); i++) {
            System.out.println((i + 1) + ". " + myArrList.get(i));
        }
    }

    private static void addItem() {
        String newItem = SafeInput.getRegexString(".+", "Enter item to add: ");
        myArrList.add(newItem);
    }

    private static void deleteItem() {
        if (myArrList.isEmpty()) {
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        System.out.println("Select the item number to delete:");
        int itemToDelete = SafeInput.getRangedInt(1, myArrList.size(), "Enter item number: ");
        myArrList.remove(itemToDelete - 1);
    }

    private static void printList() {
        if (myArrList.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.println("Current List:");
        for (int i = 0; i < myArrList.size(); i++) {
            System.out.println((i + 1) + ". " + myArrList.get(i));
        }
    }

    private static boolean confirmQuit() {
        return SafeInput.getYNConfirm("Are you sure you want to quit?");
    }
}
