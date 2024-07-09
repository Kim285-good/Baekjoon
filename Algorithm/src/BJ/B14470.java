package BJ;

import java.util.Scanner;

public class B14470 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(); //원래 고기 온도
        int B = scanner.nextInt(); //목표 온도
        int C = scanner.nextInt(); //얼어있는 고기를 1도 올리는데 걸리는 시간
        int D = scanner.nextInt(); //해동하는 데 걸리는 시간
        int E = scanner.nextInt(); //얼어있지 않은 고기를 1도 올리는데 걸리는 시간

        int result = 0;

        if(A<0){
            int exam1 = (0-A)*C;
            result += exam1;
            int exam2 = D;
            result += exam2;
            int exam3 = B*E;
            result += exam3;
        } else if(A==0) {
            int exam1 = B*E;
            result = exam1;
        } else {
            int exam1 = (B-A)*E;
            result += exam1;
        }

        System.out.println(result);
    }
}
