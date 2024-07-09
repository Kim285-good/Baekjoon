package BJ;

import java.util.Scanner;

public class B16199 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int day1 = scanner.nextInt();
        int year2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int day2 = scanner.nextInt();

        int a, b = 0;
        int age = year2 - year1;
        b=age+1;

        if(year1 == year2) {
            System.out.println(age);
        }else{
            if(month1 > month2) {
                System.out.println(age - 1);
            }else if(month1 == month2){
                if(day1 <= day2) {
                    System.out.println(age);
                }else {
                    System.out.println(age - 1);
                }
            }else{
                System.out.println(age);
            }
        }

        System.out.println(b);
        System.out.println(age);
    }
}
