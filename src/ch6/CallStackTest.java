package ch6;

public class CallStackTest {

    public static void main(String[] args) {
        fristMethod();
    }

    static void fristMethod() {
        secondMethod();
    }

    private static void secondMethod() {
        System.out.println("secondMethod()");
    }
}