package BJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class B2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            arrList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arrList);

        for (int i : arrList) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
