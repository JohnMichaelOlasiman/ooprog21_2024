import java.util.Scanner;

public class warmup_sleepin {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Is it a weekday? (true/false): ");
        boolean weekday = scanner.nextBoolean();

        System.out.print("Are you on vacation? (true/false): ");
        boolean vacation = scanner.nextBoolean();

       
        boolean canSleepIn = sleepIn(weekday, vacation);

      
        if(canSleepIn) {
            System.out.println("You can sleep now!");
        } else {
            System.out.println("Get up and be productive!");
        }

        scanner.close();
    }
}
