package week1;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description stand in stand out
 * @单据标识
 * @date 2024/5/24 10:21
 **/
public class StdinStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] intArray = new int[3];
        for (int i = 0; i < 3; i++) {
            int a = scan.nextInt();
            intArray[i] = a;
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
