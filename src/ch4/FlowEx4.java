package ch4;

import java.util.Scanner;

public class FlowEx4 {

    public static void main(String[] args) {
        int socre = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        socre = Integer.parseInt(scanner.nextLine());

        if (socre >= 90) {
            grade = 'A';
        } else if (socre >= 80) {
            grade = 'B';
        } else if (socre >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + " 입니다.");
    }
}
