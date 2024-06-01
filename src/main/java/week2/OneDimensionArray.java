package week2;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description 1D array
 * @单据标识
 * @date 2024/6/1 22:19
 **/
public class OneDimensionArray {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int numberOfLine = scan.nextInt();
        int[] integers = new int[numberOfLine];
        for (int i = 0; i < numberOfLine; i++) {
            int integer = scan.nextInt();
            integers[i] = integer;
        }

        for (int integer : integers) {
            System.out.println(integer);
        }
    }
}
