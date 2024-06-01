package week2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description BigInteger
 * @单据标识
 * @date 2024/6/1 22:08
 **/
public class BigInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger A = new BigInteger(scan.next());
        BigInteger B = new BigInteger(scan.next());
        // +
        System.out.println(A.add(B));
        // *
        System.out.println(A.multiply(B));
        // -
        System.out.println(A.subtract(B));
        // divide
        System.out.println(A.divide(B));
        // %
        System.out.println(A.mod(B));
    }
}
