package ch6;

public class MyMathTest {

    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result = mm.add(5L, 3L);
        long result1 = mm.multiply(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        double result3 = mm.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result);
        System.out.println("multiply(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("divide(5L, 3L) = " + result3);
    }
}