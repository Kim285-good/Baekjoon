package BJ;

import java.util.Scanner;

public class B1075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a -= (a %100);

        while(true) {
            if(a%b==0) {
                break;
            }
            a++;
        }
        System.out.format("%02d", a%100);
    }
}

