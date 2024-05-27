package week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description compare two substring .eaqual
 * @单据标识
 * @date 2024/5/26 20:23
 **/
public class SubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        ArrayList<String> subStrings = new ArrayList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            String subString = s.substring(i, i + k);
            subStrings.add(subString);

        }
        System.out.println(subStrings);
        Collections.sort(subStrings);
        String smallest = subStrings.get(0);
        String largest = subStrings.get(subStrings.size() - 1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
