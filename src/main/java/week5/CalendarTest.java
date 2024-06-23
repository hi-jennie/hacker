package week5;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author rd_qinglin_mu
 * @description localDate
 * @单据标识
 * @date 2024/6/23 14:12
 **/
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        // set to start of month by subtracting the current day of month - 1
        date = date.minusDays(today - 1);
        // get the first day of week value
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        // print the space before the first day of the month
        for (int i = 0; i < value; i++) {
            System.out.print("   ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            // after print the last day of the week, move forward to the next day and judge if it is the first day of the week
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        // if the last day of the month is not the last day of the week, print a new line
        // if the last day of the month is the last day of the week, the new line has been printed in the while loop:line 38
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
