package BJ;

import java.util.Scanner;

public class B14489 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int money1 = scanner.nextInt();
        int money2 = scanner.nextInt();
        int chicken = scanner.nextInt();

        int total = money1 + money2;

        if (total>chicken*2) {
            System.out.println(total-chicken*2);
        } else {
            System.out.println(total);
        }
    }
}
