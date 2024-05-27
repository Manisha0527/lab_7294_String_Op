import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {
        // Array of student names
        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Emma"};

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name to search
        System.out.print("Enter the name of the student to search: ");
        String searchName = scanner.nextLine();

        // Search for the name in the array
        boolean found = false;
        for (String name : studentNames) {
            if (name.equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Student '" + searchName + "' is found in the list.");
        } else {
            System.out.println("Student '" + searchName + "' is not found in the list.");
        }

        // Close the scanner
        scanner.close();
    }
}
