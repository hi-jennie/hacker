package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description java list
 * @单据标识
 * @date 2024/6/27 15:03
 **/
public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<>();
        int numberOfDigit = scan.nextInt();

        for (int i = 0; i < numberOfDigit; i++) {
            int currentNumber = scan.nextInt();
            results.add(currentNumber);
        }

        int queries = scan.nextInt();
        for (int i = 0; i < queries; i++) {
            String operation = scan.next();
            switch (operation) {
                case "Insert":
                    results.add(scan.nextInt(), scan.nextInt());
                    break;
                case "Delete":
                    results.remove(scan.nextInt());
                    break;
            }
        }

        for (Integer result : results) {
            System.out.print(result + " ");
        }

    }
}
