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

    // 不变性：after k rounds of comparison, the last k elements are the largest k elements in the array
    // 单调性：after k rounds of comparison，the scale of the problem will be reduced to n-k
    // 正确性：we are definitely to figure out correct results after n-1 rounds of comparison
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intNumber = scan.nextInt();
        int[] results = new int[intNumber];
        for (int i = 0; i < intNumber; i++) {
            int currentInt = scan.nextInt();
            results[i] = currentInt;
        }
        System.out.println("total: " + sum(results));
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

    public static int sum(int[] arr) {
        // 和bubble sort一样，进过k次计算之后，问题的规模都会所见之n-k
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
