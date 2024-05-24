package week1;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description read string double int
 * @单据标识
 * @date 2024/5/24 17:04
 **/
public class StandIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        // read the whole line no matter if there is white space
        // 因为 nextInt和nextDouble不会读取换行符，如果不用scan.nextLine();读取
        // 就是导致String s = scan.nextLine();读取一个空行
        scan.nextLine();
        String s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
