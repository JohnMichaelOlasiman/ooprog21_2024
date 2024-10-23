import java.util.*;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;

        System.out.print("Input 1st number: ");
        num1 = scanner.nextInt();
        System.out.print("Input 2nd number: ");
        num2 = scanner.nextInt();
        System.out.print("Input 3rd number: ");
        num3 = scanner.nextInt();

        scanner.close();

        // Conditional logic to sort the numbers in descending order
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println("Descending order: " + num1 + " " + num2 + " " + num3);
            } else {
                System.out.println("Descending order: " + num1 + " " + num3 + " " + num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println("Descending order: " + num2 + " " + num1 + " " + num3);
            } else {
                System.out.println("Descending order: " + num2 + " " + num3 + " " + num1);
            }
        } else if (num3 > num1 && num3 > num2) {
            if (num2 > num1) {
                System.out.println("Descending order: " + num3 + " " + num2 + " " + num1);
            } else {
                System.out.println("Descending order: " + num3 + " " + num1 + " " + num2);
            }
        }

        // Conditional logic to sort the numbers in ascending order
        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println("Ascending order: " + num1 + " " + num2 + " " + num3);
            } else {
                System.out.println("Ascending order: " + num1 + " " + num3 + " " + num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println("Ascending order: " + num2 + " " + num1 + " " + num3);
            } else {
                System.out.println("Ascending order: " + num2 + " " + num3 + " " + num1);
            }
        } else if (num3 < num1 && num3 < num2) {
            if (num2 < num1) {
                System.out.println("Ascending order: " + num3 + " " + num2 + " " + num1);
            } else {
                System.out.println("Ascending order: " + num3 + " " + num1 + " " + num2);
            }
        }
    }
}
