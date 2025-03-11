package chapter1;

import java.util.Scanner;

public class chapter1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요 >> ");
        int age = scanner.nextInt();

        if (age <= 0) {
            System.out.println("나이는 양수로만 입력하세요.");
            scanner.close();
            return;
        }

        int redCandles = age / 10;  
        int blueCandles = (age % 10) / 5; 
        int yellowCandles = age % 5; 

        int totalCandles = redCandles + blueCandles + yellowCandles;

        System.out.println("빨간 초 " + redCandles + "개, 파란 초 " + blueCandles + "개, 노란 초 " + yellowCandles + "개. 총 " + totalCandles + "개가 필요합니다.");

        scanner.close();
    }
}