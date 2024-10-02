public class MathTest {
    public static void main(String[] args) {
        double num = 37;
        int minValue = 68;
        int maxValue = 71;
        
        System.out.println("SQRT: " + Math.sqrt(num));
        System.out.println("SIN: " + Math.sin(300));
        System.out.println("COS: " + Math.cos(300));
        System.out.println("FLOOR: " + Math.floor(22.7));
        System.out.println("CEIL: " + Math.ceil(22.3));
        System.out.println("ROUND: " + Math.round(22.5));
        System.out.println("MAX: " + Math.max(minValue, maxValue));
        System.out.println("MIN: " + Math.min(minValue, maxValue));
        System.out.println("RANDOM: " + (Math.random() * 1000000));
    }
}
