public class SammysRentalPrice {
    public static void main(String[] args) {
                
        float hourlyRate = 40.0f;
        float additionalMinuteRate = 1.0f;
        
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.print("Enter the no. of mins. the equipment was rented: ");
        int rentalDuration = userInput.nextInt();
        
        int fullHours = rentalDuration / 60;
        int extraMinutes = rentalDuration % 60;
        
        float totalRentalCost = (fullHours * hourlyRate) + (extraMinutes * additionalMinuteRate);

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S       Sammy's makes it fun in the sun.       S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        
      
        System.out.println("Rental Time:");
        System.out.println("Hour/s: " + fullHours);
        System.out.println("Minute/s: " + extraMinutes);
        System.out.println("Total Rental Price: $" + totalRentalCost);
    }
}
