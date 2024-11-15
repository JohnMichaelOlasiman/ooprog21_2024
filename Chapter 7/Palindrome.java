import java.util.Scanner;

public class Palindrome {
      public static void main(String[] args) {
         Scanner inputScanner = new Scanner(System.in);
         System.out.println("Enter a string: ");
         String originalText = inputScanner.nextLine();
         
         String resultMessage;
         if (checkPalindrome(originalText)) {
            resultMessage = "This is a palindrome.";
         } else {
            resultMessage = "This is not a palindrome.";
         }
         
         System.out.println(resultMessage);    
      }
      
      public static boolean checkPalindrome(String text) {
         int textLength = text.length();
         String reverseText = "";
         
         for (int index = (textLength - 1); index >= 0; --index) {
            reverseText = reverseText + text.charAt(index);
         }
         
         if (reverseText.toLowerCase().equals(text.toLowerCase())) {
            return true;
         } else {
            return false;
         }
      }
}
