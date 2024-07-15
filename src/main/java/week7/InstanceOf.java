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
//    static String count(ArrayList myList) {
//        int a = 0, b = 0, c = 0;
//        for (int i = 0; i < myList.size(); i++) {
//            Object element = myList.get(i);
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
//        ArrayList myList = new ArrayList();
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            String s = sc.next();
//            if (s.equals("Student")) myList.add(new Student());
//            if (s.equals("Rockstar")) myList.add(new Rockstar());
//            if (s.equals("Hacker")) myList.add(new Hacker());
//        }
//        System.out.println(count(myList));
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