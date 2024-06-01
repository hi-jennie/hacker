package data_structure;

/**
 * @author rd_qinglin_mu
 * @description fibonacci function
 * @单据标识
 * @date 2024/5/28 16:21
 **/
public class Fib {
    public static void main(String[] args) {
        System.out.println(fib2(5, 1));
    }

    // 需要2^n的时间复杂度,不推荐
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // 线性递归的方法是
    public static int fib2(int n, int prev) {
        if (n == 0) {

            return n;
        } else {
            int prevPrev = prev;
            prev = fib2(n - 1, prevPrev);
            return prev + prevPrev;
        }
    }

}
