package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description 2D array
 * @单据标识
 * @date 2024/6/1 22:32
 **/
public class TwoDimensionArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] intArr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                intArr[i][j] = scan.nextInt();
            }
        }
        //  ArrayList must use String,Integer,Double.

        ArrayList<Integer> sums = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int firstRow = intArr[i][j] + intArr[i][j + 1] + intArr[i][j + 2];
                int secondROw = intArr[i + 1][j + 1];
                int thirdROw = intArr[i + 2][j] + intArr[i + 2][j + 1] + intArr[i + 2][j + 2];

                Integer sum = firstRow + secondROw + thirdROw;

                sums.add(sum);
            }
        }
        // get the maximum if an arraylist(use collections)
        System.out.println(Collections.max(sums));
    }
}
