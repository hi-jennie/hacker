package week3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description subarray
 * @单据标识
 * @date 2024/6/3 20:14
 **/
public class SubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] integers = new int[number];
        for (int i = 0; i < number; i++) {
            int currentInteger = scan.nextInt();
            integers[i] = currentInteger;
        }

        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int count = integers[i];
            // a single array is also counted to be a subarray;
            // so this if_statement is used to judge if it is lower than 0
            if (count < 0) {
                results.add(count);
            }
            for (int j = i + 1; j < number; j++) {
                count = count + integers[j];
                if (count < 0) {
                    results.add(count);
                }

            }
        }
        System.out.println(results.size());
    }
}
