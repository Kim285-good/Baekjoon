package BJ;

import java.util.Scanner;

public class B5554 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int total=a+b+c+d;

        int M = total/60;
        int S = total%60;

        System.out.println(M);
        System.out.println(S);

    }
}
