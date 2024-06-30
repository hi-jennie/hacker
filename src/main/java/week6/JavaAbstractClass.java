package week6;

import java.util.Scanner;

/**
 * @author rd_qinglin_mu
 * @description abstract class
 * @单据标识
 * @date 2024/6/30 22:29
 **/
public class JavaAbstractClass {
    public static void main(String[] args) {
        Book myBook = new Book();
        Scanner scan = new Scanner(System.in);
        String bookTitle = scan.nextLine();
        myBook.setTitle(bookTitle);
        System.out.println("The title is: " + myBook.title);
    }

    // abstract class cannot be instantiated
    abstract static class AbstractBook {
        // abstract method with no specific implementation
        abstract public String getTitle();

        abstract void setTitle(String s);
    }

    static class Book extends AbstractBook {
        String title;

        // implement the abstract method, we must use the same method signature by using the same return type and parameter list
        @Override
        public java.lang.String getTitle() {
            return title;
        }

        @Override
        public void setTitle(String s) {
            this.title = s;
        }
    }
}
