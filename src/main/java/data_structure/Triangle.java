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
        // 关键的地方在于j随着i的变化而变化,计算次数仍然是O(n的2次方）
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
