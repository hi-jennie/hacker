package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description sort
 * @单据标识
 * @date 2024/6/19 17:07
 **/
public class JavaSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stuNo = scan.nextInt();

        class Student {
            private final int ID;
            private final String name;
            private final double score;

            Student(int ID, String name, double score) {
                this.ID = ID;
                this.name = name;
                this.score = score;
            }

            public String getName() {
                return name;
            }

            public double getScore() {
                return score;
            }

            public int getID() {
                return ID;
            }
        }
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < stuNo; i++) {
            int ID = scan.nextInt();
            String name = scan.next();
            double score = scan.nextDouble();

            students.add(new Student(ID, name, score));
        }

        Collections.sort(students, (o1, o2) -> {
            int scoreCmp = Double.compare(o1.getScore(), o2.getScore());
            int nameCmp = o2.getName().compareTo(o1.getName());
            int IDCmp = Integer.compare(o1.getID(), o2.getID());
            if (scoreCmp == 0) {
                if (nameCmp == 0) {
                    if (IDCmp == 0) {
                        return 0;
                    } else {
                        return -IDCmp;
                    }
                } else {
                    return -nameCmp;
                }
            } else {
                return -scoreCmp;
            }
        });

        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
