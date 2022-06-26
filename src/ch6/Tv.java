package ch6;

public class Tv {

    // TV 속성 (맴버변수)
    String color;
    boolean power;
    int channel;

    // TV 기능
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
