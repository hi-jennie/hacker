package week5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author rd_qinglin_mu
 * @description hashSet
 * @单据标识
 * @date 2024/6/18 22:46
 **/
public class JavaSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();

        int[] results = new int[number];
        int init = 0;
        for (int i = 0; i < number; i++) {
            String unit = scan.nextLine();
            if (!names.contains(unit)) {
                names.add(unit);
                init++;
                results[i] = init;
            } else {
                results[i] = init;
            }
        }

        for (int result : results) {
            System.out.println(result);
        }

        // contains(element): contain return true else false;
        // remove(element)
        // names.size();
    }
}
