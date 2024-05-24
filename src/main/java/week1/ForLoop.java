package week1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description Java loop II
 * @单据标识
 * @date 2024/5/24 22:58
 **/
public class ForLoop {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] intArray = new int[t][3];
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            intArray[i][0] = a;
            intArray[i][1] = b;
            intArray[i][2] = n;
        }
        // 集合的类型要用reference date type
        ArrayList<ArrayList<Integer>> finalResult = new ArrayList<>();

        for (int i = 0; i < intArray.length; i++) {
            // 因为每一次内层循环对这三个变量有做修改，所以不能写在外层循环外面
            // 否则导致第二次的内层循环开始时会使用修改过的数据
            // 记录2的系数，当他到n-1的时候循环停止——循环终止条件
            int countCoef = 0;
            // 设置系数，其实就是2的0次方
            int coef = 1;
            int result = intArray[i][0];
            ArrayList<Integer> results = new ArrayList<>();
            while (countCoef < intArray[i][2]) {
                result = result + intArray[i][1] * coef;
                results.add(result);
                coef = coef * 2;
                countCoef++;
            }
            finalResult.add(results);
        }
        for (ArrayList<Integer> arrayList : finalResult) {
            for (int i : arrayList) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
