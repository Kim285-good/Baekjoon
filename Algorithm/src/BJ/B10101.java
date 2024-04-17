package BJ;

import java.util.Scanner;

public class B10101 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if((a+b+c)==180){
            if(a==b && a==c && b==c){
                System.out.println("Equilateral");
            }else if (a==b||a==c||b==c){
                System.out.println("Isosceles");
            }else if(a!=b || a!=c || b!=c){
                System.out.println("Scalene");
            }
        }else{
            System.out.println("Error");
        }
    }
}
