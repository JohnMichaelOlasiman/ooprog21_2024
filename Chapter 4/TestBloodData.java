import java.util.Scanner;

public class TestBloodData {
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in); 
      BloodData bd = new BloodData(); 
        
      
      String bType;  
      do {
         System.out.printf("\tEnter blood type (A, B, AB, O): ");
         bType = scan.next().toUpperCase();
         bd.setBType(bType);  
      } while (!(bType.equals("A") || bType.equals("B") || bType.equals("AB") || bType.equals("O")));
  
      
      String rH;  
      do {
            System.out.printf("\tEnter Rh factor (+ or -): ");
            rH = scan.next();
            bd.setRH(rH);  
        } while (!(rH.equals("+") || rH.equals("-")));
        
      
      bd.displayBloodInfo();
    }
}
