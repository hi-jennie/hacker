package data_structure;

/**
 * @author rd_qinglin_mu
 * @description rob
 * @单据标识
 * @date 2024/5/29 20:08
 **/
public class Rob {
    public static void main(String[] args) {
        int[] intArr = {2, 7, 9, 3, 1};
        System.out.println(rob(intArr));
    }

    public static int rob(int[] nums) {
        int first = 0;
        int second = 0;
        if (nums.length % 2 == 0) {
            for (int i = 0; i < nums.length - 1; i += 2) {
                first = first + nums[i];
                second = second + nums[i + 1];
            }
        } else {
            for (int i = 0; i < nums.length - 1; i += 2) {
                first = first + nums[i];
                second = second + nums[i + 1];
            }
            first = first + nums[nums.length - 1];
        }

        if (first > second) {
            return first;
        } else {
            return second;
        }


    }
}
