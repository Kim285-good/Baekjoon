package BJ;

import java.util.Scanner;

public class B1598 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int a1=0;
        if (a%4==0) {
            a1=a%4+4;
        } else {
            a1=a%4;
        }

        int b1 = 0;
        if (b%4==0) {
            b1=b%4+4;
        } else {
            b1=b%4;
        }
        int result1 = 0;
        if (a1>=b1){
            result1 = a1-b1;
        } if (a1<b1) {
            result1 = b1-a1;
        }

        int a2 = (a-1) /4;
        int b2 = (b-1)/4;
        int result2 = 0;
        if (a2>=b2){
            result2 = a2-b2;
        } if (a2<b2) {
            result2 = b2-a2;
        }

        System.out.println((result2+result1));
    }
}
