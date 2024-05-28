package week2;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description reverse a string
 * @单据标识
 * @date 2024/5/28 22:15
 **/
public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(palindrome(str));

        System.out.println(palindrome2(str));
    }

    // method1 StringBuilder
    public static String palindrome(String str) {
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        if (str.contentEquals(reversedStr.toString())) {
            return "Yes";
        } else {
            return "No";
        }
    }

    // method 2 iteration and join
    public static String palindrome2(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        if (str.contentEquals(reversedStr)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
