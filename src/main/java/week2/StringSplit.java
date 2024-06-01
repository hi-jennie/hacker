package week2;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description string split
 * @单据标识
 * @date 2024/6/1 10:52
 **/
public class StringSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        String newStr = "";

//        for (int i = 0; i < str.length(); i++) {
//            if ((int) str.charAt(i) > (int) 'a' && (int) str.charAt(i) < (int) 'z' || (int) str.charAt(i) == 32 || str.charAt(i) == 39) {
//                newStr = newStr + str.charAt(i);
//            }
//        }

        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            // main step:char that can match with these regular expressions will be split
            String[] strArr = str.split("[ !,?._'@]+");
            System.out.println(strArr.length);
            for (String s : strArr) {
                System.out.println(s.trim());
            }
        }

    }
}
