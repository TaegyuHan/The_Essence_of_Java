package ch4;

import java.util.Scanner;

public class FlowEx5 {

    public static void main(String[] args) {
        int socre = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        socre = scanner.nextInt();

        if (socre >= 90) {
            grade = 'A';
            if (socre >= 98) {
                opt = '+';
            } else if (socre < 94) {
                opt = '-';
            }
        } else if (socre >= 80) {
            grade = 'B';
            if (socre >= 88) {
                opt = '+';
            } else if (socre < 84) {
                opt = '-';
            }
        } else {
            grade = 'D';
        }
        System.out.printf("당신의 %c%c학점은 입니다.", grade, opt);
    }
}
