import java.util.Scanner;

public class warmup_sleepin {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Is it weekdays? (true/false): ");
        boolean weekday = scanner.nextBoolean();

        System.out.print("Is it considered as vacation? (true/false): ");
        boolean vacation = scanner.nextBoolean();

       
        boolean canSleepIn = sleepIn(weekday, vacation);

      
        if(canSleepIn) {
            System.out.println("Enjoy your vacation!");
        } else {
            System.out.println("Get up and be productive!");
        }

        scanner.close();
    }
}
