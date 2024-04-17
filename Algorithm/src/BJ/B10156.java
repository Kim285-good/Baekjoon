package BJ;

import java.util.Scanner;

public class B10156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int money = K*N;
        int result = money-M;
        System.out.println(result);
    }
}
