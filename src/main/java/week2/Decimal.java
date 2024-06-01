package week2;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description BigDecimal
 * @单据标识
 * @date 2024/6/1 16:37
 **/
public class Decimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();

        String[] strArr = new String[line];
        BigDecimal[] decimals = new BigDecimal[line];
        for (int i = 0; i < line; i++) {
            // this is used to record the primitive value
            String str = scan.next();
            strArr[i] = str;
            // BigDecimal(str) should pass in a string, or else the precision is not correct
            // if we pass in an integer-1, its actual value maybe 1.0000001;

            // this is used to compare
            BigDecimal bigDecimal = new BigDecimal(str);
            decimals[i] = bigDecimal;
        }

        for (int i = 0; i < decimals.length; i++) {
            for (int j = 0; j < decimals.length - i - 1; j++) {
                if (decimals[j].compareTo(decimals[j + 1]) == -1) {
                    // strArr swap, according to decimal Array
                    BigDecimal temp = decimals[j];
                    decimals[j] = decimals[j + 1];
                    decimals[j + 1] = temp;

                    String tempStr = strArr[j];
                    strArr[j] = strArr[j + 1];
                    strArr[j + 1] = tempStr;
                }
            }
        }
        for (String string : strArr) {
            System.out.println(string);
        }
    }
}

// better code——copilot 有点子东西！！！！
//class DecimalString {
//    BigDecimal decimal;
//    String originalString;
//
//    DecimalString(BigDecimal decimal, String originalString) {
//        this.decimal = decimal;
//        this.originalString = originalString;
//    }
//}
//
//public class Decimal {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int line = scan.nextInt();
//
//        List<DecimalString> decimalStrings = new ArrayList<>();
//        for (int i = 0; i < line; i++) {
//            String str = scan.next();
//            BigDecimal bigDecimal = new BigDecimal(str);
//            decimalStrings.add(new DecimalString(bigDecimal, str));
//        }
//
//        decimalStrings.sort(Comparator.comparing(DecimalString::getDecimal).reversed());
//
//        for (DecimalString decimalString : decimalStrings) {
//            System.out.println(decimalString.originalString);
//        }
//    }
//}