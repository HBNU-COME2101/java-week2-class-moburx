package chapter1;

import java.util.Scanner; 

public class chapter1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("생일 입력 하세요 >> ");
        int birthDate = scanner.nextInt(); 
        
        int year = birthDate / 10000;        
        int month = (birthDate % 10000) / 100; 
        int day = birthDate % 100;         

        System.out.println(year + "년 " + month + "월 " + day + "일");
        
        scanner.close(); 
    }
}