import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
                
        float hourlyRate = 40.0f;
        float additionalMinuteRate = 1.0f;
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the no. of mins. the equipment was rented: ");
        int rentalDuration = userInput.nextInt();
        
        int fullHours = rentalDuration / 60;
        int extraMinutes = rentalDuration % 60;
        
        float totalRentalCost = (fullHours * hourlyRate) + (extraMinutes * additionalMinuteRate);

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S       Sammy's makes it fun in the sun.       S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        
        System.out.println("Rental Time:");
        System.out.println("Hours: " + fullHours);
        System.out.println("Minutes: " + extraMinutes);
        System.out.println("Total Rental Price: $" + totalRentalCost);
    }
}
