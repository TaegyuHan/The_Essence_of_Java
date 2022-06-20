package ch2;

import java.util.Scanner;

public class ScannerEx {

    /* 화면에서 입력 받기 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수를 하나 입력해 주세요.>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input); // 입력 받은 문자열을 숫자로 변환
        System.out.println("입력 내용 :" + input);
        System.out.printf("num=%d%n", num);
    }

}
