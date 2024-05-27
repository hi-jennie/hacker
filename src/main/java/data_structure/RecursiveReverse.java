package data_structure;

/**
 * @author rd_qinglin_mu
 * @description reverse by using recursion
 * @单据标识
 * @date 2024/5/27 17:27
 **/
public class RecursiveReverse {
    // decrease and conquer
    public static void main(String[] args) {
        int[] arr = {70, 60, 90, 40, 80};
        reverse(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int indexLow, int indexHigh) {
        if (indexLow < indexHigh) {
            int temp = arr[indexHigh];
            arr[indexHigh] = arr[indexLow];
            arr[indexLow] = temp;
            reverse(arr, indexLow + 1, indexHigh - 1);
        }
    }
}
