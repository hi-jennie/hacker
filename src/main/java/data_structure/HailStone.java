package data_structure;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description 程序未必是算法
 * @单据标识
 * @date 2024/5/24 11:09
 **/
public class HailStone {
    // 不能证明对于任意n，序列化之后的次数总是有穷的，也没法证明是无穷的
    // 所以这看似正确的程序未必是算法，因为不确定是否满足有穷性的特点
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenInt = scanner.nextInt();

        int count = 0;
        while (givenInt > 1) {
            if (givenInt % 2 == 0) {
                givenInt /= 2;
                // givenInt = givenInt/2;
            } else {
                // 对于任意给定奇数n,3n+1后得到偶数
                givenInt = givenInt * 3 + 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
