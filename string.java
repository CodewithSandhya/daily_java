import java.util.Scanner;

public class SimpleStringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the two input strings
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        // Compare the two strings and print the result
        System.out.println(str1.compareTo(str2));
        
        sc.close(); // Close the scanner
    }
}
