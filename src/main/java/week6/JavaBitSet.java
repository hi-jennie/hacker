package week6;

import java.util.BitSet;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description
 * @单据标识
 * @date 2024/6/27 11:20
 **/
public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int opeNum = scan.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        int[][] results = new int[opeNum][2];
        for (int i = 0; i < opeNum; i++) {
            String ope = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();

            switch (ope) {
                // b1&&b2
                case "AND":
                    if (x == 1) {
                        // 按照b1和b2的交集去设置b1
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                    break;
                // b1||b2
                case "OR":
                    if (x == 1) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    // b1^b2
                    if (x == 1) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                    break;
                case "FLIP":
                    // 翻转b1第y位的数，原来是0就变成1，原来是1就变成0
                    if (x == 1) {
                        b1.flip(y);
                    } else {
                        b2.flip(y);
                    }
                    break;
                case "SET":
                    if (x == 1) {
                        b1.set(y);
                    } else {
                        b2.set(y);
                    }
                    break;
                default:
                    break;
            }
            // cardinality(); return the number of bits set to true
            results[i][0] = b1.cardinality();
            results[i][1] = b2.cardinality();
            // .length() 返回的是BitSet的长度，其实就是表示的是BitSet的最后一个bit的位置
        }

        for (int[] result : results) {
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
