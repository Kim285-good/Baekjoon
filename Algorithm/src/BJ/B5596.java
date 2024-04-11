package BJ;

import java.util.Scanner;

public class B5596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[4];
        int[] array2 = new int[4];

        for(int i = 0; i<4; i++) {
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i<4; i++) {
            array2[i] = scanner.nextInt();
        }

        int sum1 = 0;
        for (int num : array1) {
            sum1 += num;
        }

        int sum2 = 0;
        for (int num : array2) {
            sum2 += num;
        }

        if(sum1>sum2) {
            System.out.println(sum1);
        } else if(sum1<sum2) {
            System.out.println(sum2);
        } else {
            System.out.println(sum1);
        }
    }
}
