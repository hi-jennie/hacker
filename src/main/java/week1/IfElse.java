package week1;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description if else
 * @单据标识
 * @date 2024/5/24 16:55
 **/
public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
        scanner.close();
    }
}
