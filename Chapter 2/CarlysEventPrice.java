import java.util.Scanner;

public class CarlysEventPrice {

    public static final float COST_PER_PERSON = 35.00f;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of guests: ");
        int numberOfGuests = scanner.nextInt();

        float totalCost = calculateTotalCost(numberOfGuests);

        displayCompanyMotto();
        displayEventDetails(numberOfGuests, totalCost);
        displayEventSizeStatus(numberOfGuests);

        return;
    }

    public static float calculateTotalCost(float numberOfGuests){
        return numberOfGuests * COST_PER_PERSON;
    }

    public static void displayCompanyMotto(){
        System.out.println();
        System.out.println("*********************************************");
        System.out.println("*     Carly's makes the food that makes     *");
        System.out.println("*                it a party.                *");
        System.out.println("*********************************************");
        System.out.println();
        return;
    }

    public static void displayEventDetails(int numberOfGuests, float totalCost){
        System.out.println("Number of Guests: " + numberOfGuests);
        System.out.println("Price Per Guest: $" + COST_PER_PERSON);
        System.out.println("Total Price: $" + totalCost);
        System.out.println();
        
        return;
    }

    public static void displayEventSizeStatus(int numberOfGuests){
        if(numberOfGuests >= 50){
            System.out.println("Is the event considered a large event?");
            System.out.println(true);
        } else {
            System.out.println("Is the event considered a large event?");
            System.out.println(false);
        }

        return;
    }
}
