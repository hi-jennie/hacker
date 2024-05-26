package week1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description convert a int into a string
 * @单据标识
 * @date 2024/5/26 15:17
 **/

public class IntoString {
    public static void main(String[] args) {


        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            // the main method of converting an int into a string
            // String s = Integer.toString(n);

            // tips two
            // String s = String.valueOf(n);  String ageAsString = String.format("%d", n);

            // tips three  DecimalFormat 类用于格式化十进制数字。你可以用它将整数转换为字符串
            DecimalFormat decimalFormat = new DecimalFormat("#");
            String s = decimalFormat.format(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }

            // 代码段是一个尝试退出程序的操作。这段代码使用了 System.exit(0) 方法来尝试终止 Java 虚拟机（JVM）。
            // 这个方法接受一个状态码作为参数，通常情况下，一个非零状态码表示异常终止。

            // 这段代码被包裹在一个 try-catch 块中，这是因为 System.exit(0) 方法可能会抛出 SecurityException 异常。
            // 这种情况通常发生在当前的安全管理器（Security Manager）不允许使用 exit 方法来终止 JVM 的时候。
            try {
                System.exit(0);
            } catch (SecurityException e) {
                System.out.println("Unsuccessful Termination!!");
            }

        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}



