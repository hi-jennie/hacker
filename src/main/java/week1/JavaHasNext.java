package week1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description end of file
 * @单据标识
 * @date 2024/5/25 15:26
 **/
public class JavaHasNext {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> results = new ArrayList<>();
        // hasNext 会block函数，等待指令，要么输入东西，返回true，要么输入EOF返回false，就会执行下一段代码
        while (scan.hasNext()) {
            String str = scan.nextLine();
            results.add(str);
        }
        
        for (int i = 0; i < results.size(); i++) {
            int m = i + 1;
            System.out.println(m + " " + results.get(i));
        }
    }
}
