package BJ;

import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int su1 = scanner.nextInt();
        int su2 = scanner.nextInt();

        int a, b, c, d = 0;

        int num1 = su2%10;
        int num2 = ((su2-num1)%100)/10;
        int num3 = (su2-num1-10*num2)/100;

        a= su1*num1;
        b= su1*num2;
        c= su1*num3;
        d=su1*su2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
