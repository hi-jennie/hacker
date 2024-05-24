package data_structure;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description hailstone
 * @单据标识
 * @date 2024/5/24 11:09
 **/
public class HailStone {
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
