package week1;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description sub string
 * @单据标识
 * @date 2024/5/26 20:11
 **/
public class SubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int startIndex = in.nextInt();
        int endIndex = in.nextInt();
        // if only pass one argument, it means from the current index to the end of the whole string
        String subString = S.substring(startIndex, endIndex);
        System.out.println(subString);

        // StringBuilder str = new StringBuilder("GeeksForGeeks");
    }
}
