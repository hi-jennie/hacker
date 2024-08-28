package week7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Boolean> results = new ArrayList<>();
        String current;
        do {
            current = scan.nextLine();
            if (current.isEmpty()) break; // 处理空行退出
            boolean result = balanced(current);
            results.add(result);
        } while (scan.hasNextLine());

        for (Boolean result : results) {
            System.out.println(result);
        }
    }

    public static boolean balanced(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            switch (c) {
                case '(', '[', '{':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}