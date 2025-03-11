package chapter1;

import java.util.Scanner;

public class chapter1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(x1, y1), (x2, y2)의 좌표 입력 >> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int minX = 10, minY = 10, maxX = 200, maxY = 300;

        int rectLeft = Math.min(x1, x2);
        int rectRight = Math.max(x1, x2);
        int rectTop = Math.min(y1, y2);
        int rectBottom = Math.max(y1, y2);

        if (rectLeft >= minX && rectRight <= maxX && rectTop >= minY && rectBottom <= maxY) {
            System.out.println("(" + x1 + "," + y1 + "), (" + x2 + ", " + y2 + ") 사각형은 (" 
                               + minX + ", " + minY + "), (" + maxX + ", " + maxY + ") 사각형에 포함된다.");
        } else {
            System.out.println("(" + x1 + "," + y1 + "), (" + x2 + ", " + y2 + ") 사각형은 (" 
                               + minX + ", " + minY + "), (" + maxX + ", " + maxY + ") 사각형에 포함되지 않는다.");
        }

        scanner.close(); 
    }
}