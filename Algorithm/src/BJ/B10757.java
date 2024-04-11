package BJ;

import java.math.BigInteger;
import java.util.Scanner;

public class B10757 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // BigInteger 타입으로 변경
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        // BigInteger의 add 메소드 사용
        BigInteger result = a.add(b);

        System.out.println(result);
    }
}
