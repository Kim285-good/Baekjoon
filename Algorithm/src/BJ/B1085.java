package BJ;

import java.util.Scanner;

public class B1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int a, b=0;

        a= w-x;
        b= h-y;
        int min=x;

        if(y < min){
            min=y;
        }
        if(a<min){
            min=a;
        }
        if (b<min) {
            min=b;
        }

        System.out.println(min);
    }
}
