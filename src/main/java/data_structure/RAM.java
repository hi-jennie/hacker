package data_structure;

/**
 * @author rd_qinglin_mu
 * @description 向下取整
 * @单据标识
 * @date 2024/5/24 12:19
 **/
public class RAM {
    public static void main(String[] args) {
        int divider = 12;
        int dividend = 5;
        int count = 0;
        while (divider > dividend) {
            divider = divider - dividend;
            count++;
        }
        System.out.println(count);
    }
}
