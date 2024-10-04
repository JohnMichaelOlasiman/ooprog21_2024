public class BloodData {
   private String bType;  
   private String rH;     
   
   // Constructor calling the defaultPatient method to set default values
   public BloodData() {
        defaultPatient();
    }
   
   // Method to set default blood type and Rh factor
   public void defaultPatient() {
      this.bType = "A";
      this.rH = "-";
   }
   
   // Getter for bType
   public String getBType() {
      return bType;
   }
   
   // Setter for bType with validation
   public void setBType(String bType) {
      if (bType.equals("A") || bType.equals("B") || bType.equals("AB") || bType.equals("O")) {
         this.bType = bType;
      } else {
         System.out.println("\tInvalid blood type!!! Please try again.");
      }
   }
   
   // Getter for rH
   public String getRH() {
      return rH;
   }
   
   // Setter for rH with validation
   public void setRH(String rH) {
      if (rH.equals("+") || rH.equals("-")) {
          this.rH = rH;
      } else {
          System.out.println("\tInvalid Rh factor!!! Please try again.");
      }
   }

   // New method to display blood information
   public void displayBloodInfo() {
      System.out.println("\n\tYour Blood type: " + this.bType);   
      System.out.println("\tYour Rh factor: " + this.rH);
      System.out.printf("\tThe result: %s%s\n", this.bType, this.rH);
   }
}
