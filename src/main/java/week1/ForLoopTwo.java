package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rd_qinglin_mu
 * @description for loop
 * @单据标识
 * @date 2024/5/26 17:12
 **/

public class ForLoopTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " * " + i + " = " + result);
        }

        bufferedReader.close();
    }
}