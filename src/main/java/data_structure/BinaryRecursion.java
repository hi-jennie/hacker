package data_structure;

/**
 * @author rd_qinglin_mu
 * @description binary recursion
 * @单据标识
 * @date 2024/5/27 17:56
 **/
public class BinaryRecursion {
    public static void main(String[] args) {
        int[] arr = {70, 60, 90, 40, 80, 90, 100, 110};
        System.out.println(binarySum(arr, 1, 5));

    }

    public static int binarySum(int[] arr, int indexLow, int indexHigh) {
        // base case
        // the real code block that will be executed at the bottom of the recursion, before we stop the recursion, it won't be executed
        if (arr[indexLow] == arr[indexHigh]) {
            return arr[indexLow];
        }
        int mid = (indexLow + indexHigh) / 2;
        // I forgot to add 1 to mid,so I can't get the correct result
        return binarySum(arr, indexLow, mid) + binarySum(arr, mid + 1, indexHigh);
    }
}
