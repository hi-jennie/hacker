package data_structure;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description bubble sort
 * @单据标识
 * @date 2024/5/27 14:44
 **/
public class BubbleSort {
    // 在顺序序列中，任意一对相邻元素总是顺序的
    // 在无序序列中，总有一对相邻元素总是无序的
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intNumber = scan.nextInt();
        int[] results = new int[intNumber];
        for (int i = 0; i < intNumber; i++) {
            int currentInt = scan.nextInt();
            results[i] = currentInt;
        }
        // nested loop
        // the outer loop is used to control the number of rounds of the comparison
        for (int i = 0; i < results.length; i++) {
            // the inner loop is used to compare the size of the elements
            // results.length - i - 1 is used to reduce the number of comparisons in each round

            // because we figured out the largest number at the end of the array,there is no need to compare it again
            for (int j = 0; j < results.length - i - 1; j++) {
                if (results[j] > results[j + 1]) {
                    int temp = results[j];
                    results[j] = results[j + 1];
                    results[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }


    }

}
