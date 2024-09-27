class Billing {
   private static final double TAX_RATE = 0.08; 

   static void computeBill(double price){
      double totalPrice = price + (price * TAX_RATE);
      System.out.println("The total price for the bill is: $" + totalPrice);
   }
   
   static void computeBill(double price, int quantity){
      double subTotal = price * quantity;
      double totalPrice = subTotal + (subTotal * TAX_RATE);
      System.out.println("The total price for the bill is: $" + totalPrice);
   }
   
   static void computeBill(double price, int quantity, int coupon_discount){
      double subTotal = (price * quantity) - coupon_discount;
      double totalPrice = subTotal + (subTotal * TAX_RATE);
      System.out.println("The total price for the bill is: $" + totalPrice);
   }
   
   public static void main(String[] a){
      computeBill(23.2);
      computeBill(24.4, 2);
      computeBill(40.45, 2, 10);
   }
}