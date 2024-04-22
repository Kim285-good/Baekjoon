package BJ;

import java.util.Scanner;

public class B10797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int[] car = new int[5];
        for(int i = 0; i<5; i++) {
            car[i] = scanner.nextInt();
        }
        int count=0;
        for(int i=0; i<5; i++) {
            if(a==car[i]){
                count = 1+count;
            }
        }
        System.out.println(count);
    }
}
