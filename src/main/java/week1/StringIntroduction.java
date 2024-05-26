package week1;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description adjoin string
 * @单据标识
 * @date 2024/5/26 17:19
 **/

public class StringIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a.length() + b.length());

        char firstCharA = a.charAt(0);
        char firstCharB = b.charAt(0);
        // convert a char to the corresponding ASCII, convert char to an int directly
        if ((int) firstCharA > (int) firstCharB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        a = a.replace(firstCharA, a.toUpperCase().charAt(0));
        b = b.replace(firstCharB, b.toUpperCase().charAt(0));
        // another way to join two strings by using method supplied by String class
        // the first parameter is the symbol we use to join these strings
        String result = String.join(" ", a, b);
        System.out.println(result);
    }
}
