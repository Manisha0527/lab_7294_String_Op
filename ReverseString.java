import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        
        String reversedString = reverseString(originalString);
        
        System.out.println("Reversed string: " + reversedString);
        
        scanner.close();
    }
    
    public static String reverseString(String str) {
        // Initialize an empty string to store the reversed string
        String reversed = "";
        
        // Iterate through the original string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversed += str.charAt(i);
        }
        
        return reversed;
    }
}
