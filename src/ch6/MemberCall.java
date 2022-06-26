package ch6;

public class MemberCall {

    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    static int cv2 = new MemberCall().iv;

    static void staticMethod1() {
        System.out.println(cv); // 스태틱 변수
        MemberCall c = new MemberCall();
        System.out.println(c.iv); // 인스턴스 변수
    }

    private void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
        MemberCall c = new MemberCall();
        c.instanceMethod1();
    }

    private void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}