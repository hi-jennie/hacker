package data_structure;

/**
 * @author rd_qinglin_mu
 * @description triangle
 * @单据标识
 * @date 2024/5/24 15:32
 **/
public class Triangle {
    public static void main(String[] args) {
        int m = 10;
        // i 也可以指数级扩大
        for (int i = 0; i < m; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void method() {
        int m = 10;
        // 关键的地方在于j随着i的变化而变化,计算次数仍然是O(n的2次方）
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void methodTwo() {
        int m = 10;
        // j 的步长变为2了，可以更快的达到 j < i 的临界条件计算次数仍然是O(n的2次方）
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j += 2) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
