public class prelim {

    public static int fibonacci(int n) {
        if (n <= 1) { 
            return n;
            
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            System.out.println("fibonacci(" + i + ")--> " + fibonacci(i));
        }
    }
}