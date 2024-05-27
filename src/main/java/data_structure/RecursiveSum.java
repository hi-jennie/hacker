package data_structure;

/**
 * @author rd_qinglin_mu
 * @description RecursiveSum
 * @单据标识
 * @date 2024/5/27 17:08
 **/
public class RecursiveSum {
    // recursion trace
    public static int calculateSumUsingRecursion(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
//            一样的效果
//        if (i == arr.length -1) {
//            return arr[i];
//        }
        return arr[i] + calculateSumUsingRecursion(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {70, 60, 90, 40, 80};
        int totalSum = calculateSumUsingRecursion(arr, 0);
        System.out.println("Total sum of array elements: " + totalSum);
    }
}
