package week3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description arraylist
 * @单据标识
 * @date 2024/6/5 18:21
 **/
public class OneDArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();

        for (int i = 0; i < line; i++) {
            ArrayList<Integer> currentLine = new ArrayList<>();
            int numberOfCurrentLine = scan.nextInt();
            for (int j = 0; j < numberOfCurrentLine; j++) {
                int currentNumber = scan.nextInt();
                currentLine.add(currentNumber);
            }
            results.add(currentLine);
        }

        int queryLine = scan.nextInt();
        int[][] queryResults = new int[queryLine][2];
        for (int i = 0; i < queryLine; i++) {
            queryResults[i][0] = scan.nextInt();
            queryResults[i][1] = scan.nextInt();
        }

        for (int i = 0; i < queryLine; i++) {
            if (queryResults[i][0] == 0 ||
                    results.get(queryResults[i][0] - 1).isEmpty()
                    // pay attention to the boundary
                    || queryResults[i][0] > results.size()
                    || queryResults[i][1] > results.get(queryResults[i][0] - 1).size()) {
                System.out.println("ERROR!");

            } else {
                System.out.println(results.get(queryResults[i][0] - 1).get(queryResults[i][1] - 1));
            }
        }
    }
}
