package BJ;

import java.util.Scanner;

public class B10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        if(a<40) {
            a=40;
        }
        if(b<40) {
            b=40;
        }
        if(c<40) {
            c=40;
        }
        if(d<40) {
            d=40;
        }
        if(e<40) {
            e=40;
        }

        int avg = (a+b+c+d+e)/5;

        System.out.println(avg);
    }
}
