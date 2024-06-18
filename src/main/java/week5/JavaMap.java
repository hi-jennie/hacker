package week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description map
 * @单据标识
 * @date 2024/6/18 19:57
 **/
public class JavaMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();

        String[][] phoneBook = new String[number][2];
        for (int i = 0; i < number; i++) {

            String name = scan.nextLine();
            String phoneNumber = scan.nextLine();
            phoneBook[i][0] = name;
            phoneBook[i][1] = phoneNumber;
        }
        String[] names = new String[number];
        for (int i = 0; i < number; i++) {
            String name = scan.nextLine();
            names[i] = name;
        }
        for (String name : names) {
            int flag = 0;
            for (String[] strings : phoneBook) {
                if (name.equals(strings[0])) {
                    System.out.println(strings[0] + "=" + strings[1]);
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println("Not found");
            }
        }
    }

    static public void betterCode() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // Storing data in a Key Value pairs
        Map<String, Integer> map = new HashMap<String, Integer>();
        s.nextLine();
        // Adding name and phoneNo to the Map
        while (n-- > 0) {
            String name = s.nextLine();
            int phoneNo = s.nextInt();
            s.nextLine();
            map.put(name, phoneNo);
        }
        // Queries for the Name
        while (s.hasNextLine()) {
            String queryName = s.nextLine();
            if (map.containsKey(queryName)) {
                System.out.println(queryName + "=" + map.get(queryName));
            } else {
                System.out.println("Not found");
            }
        }
    }


    static public void example() {
        HashMap<Integer, String> sites = new HashMap<>();
        sites.put(1, "Jennie");
        sites.put(2, "Rustin");
        sites.put(3, "White");
        sites.put(4, "Turkey");
        System.out.println(sites);

        // use get(key) to have access to the corresponding value
        String value = sites.get(3); // White
        System.out.println(value);

        // remove(key) delete a specific key and value
        sites.remove(4); // 删除 key 为 4 的键值对
        System.out.println(sites);

        // get the size
        int size = sites.size();
        System.out.println("HashMap size: " + size);
    }

}

