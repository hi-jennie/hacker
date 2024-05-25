package week1;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description data type
 * @单据标识
 * @date 2024/5/25 10:48
 **/
public class DataType {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        String[] strArray = new String[t];
        long[] longArray = new long[t];
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                if (x >= -128 && x <= 127) {
                    strArray[i] = "byte";
                    longArray[i] = x;
                    continue;
                }
                if (x >= -32768 && x <= 32767) {
                    strArray[i] = "short";
                    longArray[i] = x;
                    continue;
                }
                if (x >= -2147483648 && x <= 2147483647) {
                    strArray[i] = "int";
                    longArray[i] = x;
                    continue;
                }
                if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
                    strArray[i] = "long";
                    longArray[i] = x;

                }
            } catch (Exception e) {
                String str = sc.next();
                strArray[i] = str;
            }
        }
        for (int i = 0; i < t; i++) {
            if (!(strArray[i].equals("byte") || strArray[i].equals("short") || strArray[i].equals("int") || strArray[i].equals("long"))) {
                System.out.println(strArray[i] + " can't be fitted anywhere.");
                continue;
            }
            // 运用case穿透
            System.out.println(longArray[i] + " can be fitted in:");
            switch (strArray[i]) {
                case "byte":
                    System.out.println("* byte");
                case "short":
                    System.out.println("* short");
                case "int":
                    System.out.println("* int");
                case "long":
                    System.out.println("* long");
                    break;
                default:
                    System.out.println(strArray[i] + " can't be fitted anywhere.");
            }

        }

    }

    public static void betterCode(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        String[] strArray = new String[t];
        long[] longArray = new long[t];
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                strArray[i] = getType(x);
                longArray[i] = x;
            } catch (Exception e) {
                String str = sc.next();
                strArray[i] = str;
            }
        }
        for (int i = 0; i < t; i++) {
            if (!(strArray[i].equals("byte") || strArray[i].equals("short") || strArray[i].equals("int") || strArray[i].equals("long"))) {
                System.out.println(strArray[i] + " can't be fitted anywhere.");
                continue;
            }
            // 运用case穿透
            System.out.println(longArray[i] + " can be fitted in:");
            switch (strArray[i]) {
                case "byte":
                    System.out.println("* byte");
                case "short":
                    System.out.println("* short");
                case "int":
                    System.out.println("* int");
                case "long":
                    System.out.println("* long");
                    break;
                default:
                    System.out.println(strArray[i] + " can't be fitted anywhere.");
            }

        }

    }

    private static String getType(long x) {
        if (x >= -128 && x <= 127) {
            return "byte";
        }
        if (x >= -32768 && x <= 32767) {
            return "short";
        }
        if (x >= -2147483648 && x <= 2147483647) {
            return "int";
        }
        if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
            return "long";
        }
        return "out of range";
    }

}

