package week1;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description static initialization block
 * @单据标识
 * @date 2024/5/26 11:07
 **/
public class Static {
    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean flag = true;

    // static initialization block
    // it will be executed when the class is loaded
    static {
        if (B <= 0 || H <= 0 || B * H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    // method with static only haa access to static field;
    // so inside the main method, we have to use static to access the static field
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of cl