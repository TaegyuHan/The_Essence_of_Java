package ch6;

public class ReferenceParaEx2 {

    public static void main(String[] args) {
        int[] x = {10};
        System.out.println("main() : x = " + x[0]);

        change(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }

    private static void change(int[] x) {
        x[0] = 1_000;
        System.out.println("change() : x = " + x[0]);
    }
}
