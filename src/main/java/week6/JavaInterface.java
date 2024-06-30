package week6;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description interface
 * @单据标识
 * @date 2024/6/30 16:48
 **/
public class JavaInterface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        MyCalculator myCal = new MyCalculator();
        System.out.println(myCal.divisor_sum(n));
    }

    // 内部接口
    public interface AdvancedArithmetic {
        int divisor_sum(int n);
    }

    // 内部类——这里的static不能忘记，否则无法在JavaInterface类内部中调用
    public static class MyCalculator implements AdvancedArithmetic {
        @Override
        public int divisor_sum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            System.out.println("I implemented: AdvancedArithmetic");
            return sum;
        }
    }
}
