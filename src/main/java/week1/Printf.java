package week1;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description printf
 * @单据标识
 * @date 2024/5/24 22:06
 **/
public class Printf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        String[] strArray = new String[3];
        int[] intArray = new int[3];
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            strArray[i] = s1;
            intArray[i] = x;
        }
        for (int i = 0; i < 3; i++) {
            // 首先，int的占位符是d
            // 其次，左对齐在整数前面加上-，不加表示有对齐，然后跟上一个int表示占位宽度
            System.out.printf("%-15s %03d", strArray[i], intArray[i]);
            System.out.println();
        }
        System.out.println("================================");

    }
}
