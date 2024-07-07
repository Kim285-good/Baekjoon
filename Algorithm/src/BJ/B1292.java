package BJ;

import java.util.Scanner;

public class B1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        String answer = "";
        for (int i = 0; i < str[0].length(); i++) {
            char tmp = str[0].charAt(i);
            boolean same = true;
            for (int j = 1; j < n; j++) {
                if (i >= str[j].length() || tmp != str[j].charAt(i)) {
                    same = false;
                    break;
                }
            }
            if (same) {
                answer += tmp;
            } else {
                answer += "?";
            }
        }
        System.out.println(answer);
    }
}
