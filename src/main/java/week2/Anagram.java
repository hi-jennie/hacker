package week2;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description Anagram
 * @单据标识
 * @date 2024/5/28 22:44
 **/
public class Anagram {
    // The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] first = sort(scan.next().toLowerCase().toCharArray());
        char[] second = sort(scan.next().toLowerCase().toCharArray());

        String firstString = new String(first);
        String secondString = new String(second);

        if (firstString.equals(secondString)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    public static char[] sort(char[] charArr) {
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr.length - i - 1; j++) {
                if ((int) charArr[j] > (int) charArr[j + 1]) {
                    char temp = charArr[j];
                    charArr[j] = charArr[j + 1];
                    charArr[j + 1] = temp;
                }
            }
        }
        return charArr;
    }
}
