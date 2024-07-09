package BJ;

import java.util.Scanner;

public class B1267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }



        int[] Y = new int[n];
        for(int i = 0; i<n; i++) {

            if((arr[i]+1)%30==0){
                int a= arr[i]/30;
                Y[i] = a*10;
            } else if(arr[i]==0) {
                Y[i]=0;
            } else if ((arr[i]+1)%30!=0){
                int a= arr[i]/30;
                Y[i] = a*10+10;
            }
        }
        int sumY = 0;
        for(int num : Y) {
            sumY += num;
        }

        int[] M = new int[n];
        for(int i = 0; i<n; i++) {

            if((arr[i]+1)%60==0){
                int a= arr[i]/60;
                M[i] = a*15;
            } else if(arr[i]==0) {
                M[i]=0;
            } else if ((arr[i]+1)%60!=0){
                int a= arr[i]/60;
                M[i] = a*15+15;
            }
        }
        int sumM = 0;
        for(int num : M) {
            sumM += num;
        }
        if (sumY < sumM) {
            System.out.println("Y " + sumY);
        } else if (sumY > sumM) {
            System.out.println("M " + sumM);
        } else {
            System.out.println("Y M " + sumY);
        }
    }
}
