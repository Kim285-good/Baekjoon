package BJ;

import java.util.Scanner;

public class B5524 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] arr = new String[n];

        for(int i = 0; i<n; i++) {
            arr[i] = scanner.next();

            System.out.println(arr[i].toLowerCase());
        }


        scanner.close();
    }
}
