package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class B3273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int x = sc.nextInt();
        int startpoint = 0;
        int endpoint = n-1;
        int count = 0;
        int hap = 0;

        while(startpoint < endpoint) {
            hap = arr[startpoint] + arr[endpoint];

            if (hap > x) {
                endpoint--;
            } else if (hap < x) {
                startpoint++;
            } else {
                endpoint--;
                startpoint ++;
                count++;
            }


        }
        System.out.println(count);


    }
}
