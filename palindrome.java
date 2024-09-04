import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Remove spaces and convert to lowercase for accurate comparison
        String cleanedString = originalString.replaceAll("\\s+", "").toLowerCase();
        
        // Reverse the cleaned string
        String reversedString = new StringBuilder(cleanedString).reverse().toString();

        // Check if the original cleaned string is equal to the reversed string
        if (cleanedString.equals(reversedString)) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }
        
        scanner.close();
    }
}
