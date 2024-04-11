package BJ;

import java.util.Scanner;

public class B5532 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int a=0;
        int b=0;

        if(A%C==0) {
            a=A/C;
        } else {
            a=A/C+1;
        }

        if(B%D==0) {
            b=B/D;
        } else {
            b=B/D+1;
        }

        if (a>b) {
            System.out.println(L-a);
        } else {
            System.out.println(L-b);
        }
    }
}
