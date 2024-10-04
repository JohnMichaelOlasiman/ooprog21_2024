public class BloodData {
   private String bloodType;
   private String rhFactor;
   
   // Constructor calling the defaultPatient method to set default values
   public BloodData() {
        defaultPatient();
    }
   
   // Method to set default blood type and Rh factor
   public void defaultPatient() {
      this.bloodType = "A"; 
      this.rhFactor = "-"; 
   }
   
   // Getter for bloodType
   public String getBloodType() {
      return bloodType;
   }
   
   // Setter for bloodType with validation
   public void setBloodType(String bloodType) {
      if (bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O")) {
         this.bloodType = bloodType;
      } else {
         System.out.println("\tInvalid blood type!!! Please try again.");
      }
   }
   
   // Getter for rhFactor
   public String getRhFactor() {
      return rhFactor;
   }
   
   // Setter for rhFactor with validation
   public void setRhFactor(String rhFactor) {
      if (rhFactor.equals("+") || rhFactor.equals("-")) {
          this.rhFactor = rhFactor;
      } else {
          System.out.println("\tInvalid Rh factor!!! Please try again.");
      }
   }

   // New method to display blood information
   public void displayBloodInfo() {
      System.out.println("\n\tThe Blood type: " + this.bloodType);   
      System.out.println("\tThe Rh factor: " + this.rhFactor);
      System.out.printf("\tThe result: %s%s\n", this.bloodType, this.rhFactor);
   }
}
