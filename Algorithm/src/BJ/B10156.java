package BJ;

import java.util.Scanner;

public class B10156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int cost = K*N;

        if(cost > M) {
            System.out.println((cost-M));
        } else {
            System.out.println("0");
        }
    }
}
