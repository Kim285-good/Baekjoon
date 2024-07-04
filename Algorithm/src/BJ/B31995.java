package BJ;

import java.util.Scanner;

public class B31995 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c= a-1;
        int d= b-1;

        int result = c*d*2;

        System.out.println(result);
    }
}
