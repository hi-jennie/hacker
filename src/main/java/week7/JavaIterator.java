package week7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int intNum = scan.nextInt();
        int strNum = scan.nextInt();
        while (intNum > 0) {
            int curInt = scan.nextInt();
            arr.add(curInt);
            intNum--;
        }

        while (strNum > 0) {
            String curStr = scan.next();
            arr.add(curStr);
            strNum--;
        }

        func(arr);

    }

    public static void func(ArrayList arr) {
        Iterator arrIter = arr.iterator();
        while (arrIter.hasNext()) {
            Object item = arrIter.next();
            if (item instanceof String) {
                System.out.println((String) item);
                while (arrIter.hasNext()) {
                    System.out.println(arrIter.next());
                }
            }
        }

    }
}
