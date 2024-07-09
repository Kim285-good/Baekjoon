package BJ;

import java.util.Scanner;
import java.math.BigInteger;
public class B1247{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<3; i++ ) {
            int n = sc.nextInt();
            BigInteger a = new BigInteger("0");
            for(int j = 0; j<n; j++) {
                a = a.add(sc.nextBigInteger());
                //a += sc.nextBigInteger();
            }
            if(a.compareTo(BigInteger.ZERO)<0) {
                System.out.println("-");
            } else if(a.compareTo(BigInteger.ZERO)>0) {
                System.out.println("+");
            } else {
                System.out.println("0");
            }
        }
    }
}