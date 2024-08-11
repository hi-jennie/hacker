package week7;

import java.util.Scanner;

public class LambdaExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        String[] result = new String[times];
        int index = 0;

        while (times > 0) {
            int checkType = scan.nextInt();
            int checkNum = scan.nextInt();

            result[index] = switch (checkType) {
                case 1:
                    String even = (checkNum % 2 == 0) ? "EVEN" : "ODD";
                    yield even;
                case 2:
                    String prime = isPrime(checkNum) ? "PRIME" : "COMPOSITE";
                    yield prime;
                case 3:
                    String palindrome = isPalindrome(checkNum) ? "PALINDROME" : "NOT PALINDROME";
                    yield palindrome;
                default:
                    throw new IllegalStateException("Unexpected value: " + checkType);
            };
            times--;
            index++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static boolean isPrime(int i) {
        if (i <= 1) return false;
        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int input) {
        String copy = String.valueOf(input);
        StringBuilder sb = new StringBuilder(copy);
        sb.reverse();
        return copy.contentEquals(sb);
    }
}
