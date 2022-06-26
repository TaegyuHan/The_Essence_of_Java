package ch6;

public class PrimitiveParamEx {

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        chnage(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    private static void chnage(int x) {
        x = 1_000;
        System.out.println("change() : x = " + x);
    }
}
