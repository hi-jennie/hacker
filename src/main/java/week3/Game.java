package week3;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description 1D array
 * @单据标识
 * @date 2024/6/3 20:51
 **/
public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int queries = scan.nextInt();
        boolean[] results = new boolean[queries];

        for (int i = 0; i < queries; i++) {
            int numberOfDigit = scan.nextInt();
            int leap = scan.nextInt();
            int[] arr = new int[numberOfDigit];
            for (int j = 0; j < numberOfDigit; j++) {
                arr[j] = scan.nextInt();
            }
            results[i] = judge(arr, leap, 0);
        }

        for (boolean result : results) {
            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean judge(int[] arr, int leap, int m) {
        if (m + leap > arr.length) {
            return true;
        } else if (m + leap < arr.length && m < arr.length && arr[m] == 0 && arr[m + leap] == 0) {
            return judge(arr, leap, m + leap) || judge(arr, leap, m + leap - 1) || judge(arr, leap, m + leap + 1);
        } else {
            return false;
        }
    }
}
