package BJ;

import java.util.Scanner;

public class B5543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];
        for(int i = 0; i<3; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i <arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min1=0;

        if (a>b) {
            min1=b;
        } else {
            min1 = a;
        }
        System.out.println(min+min1-50);
    }
}
