package week7;

import java.util.Scanner;

public class InstanceOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int cntStu = 0;
        int cntRoc = 0;
        int cntHac = 0;

        for (int i = 0; i < num; i++) {
            String itemType = scan.next();
            Object item = createItem(itemType);

            if (item instanceof Student) {
                cntStu++;
            }
            if (item instanceof Rockstar) {
                cntRoc++;
            }
            if (item instanceof Hacker) {
                cntHac++;
            }
        }

        System.out.print(cntStu + " " + cntRoc + " " + cntHac);
    }

    private static Object createItem(String itemType) {
        switch (itemType) {
            case "Student":
                return new Student();
            case "Rockstar":
                return new Rockstar();
            case "Hacker":
                return new Hacker();
            default:
                return null;
        }
    }

    static class Student {
    }

    static class Rockstar {
    }

    static class Hacker {
    }
}


//public class InstanceOf {
//    static String count(ArrayList mylist) {
//        int a = 0, b = 0, c = 0;
//        for (int i = 0; i < mylist.size(); i++) {
//            Object element = mylist.get(i);
//            if (element instanceof Student)
//                a++;
//            if (element instanceof Rockstar)
//                b++;
//            if (element instanceof Hacker)
//                c++;
//        }
//        String ret = a + " " + b + " " + c;
//        return ret;
//    }
//
//    public static void main(String[] argh) {
//        ArrayList mylist = new ArrayList();
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            String s = sc.next();
//            if (s.equals("Student")) mylist.add(new Student());
//            if (s.equals("Rockstar")) mylist.add(new Rockstar());
//            if (s.equals("Hacker")) mylist.add(new Hacker());
//        }
//        System.out.println(count(mylist));
//    }
//
//    static class Student {
//    }
//
//    static class Rockstar {
//    }
//
//    static class Hacker {
//    }
//}