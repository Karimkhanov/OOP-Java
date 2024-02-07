package com.example.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenMatcher {

    private Deque<Character> stack = new ArrayDeque<>();
    private char[] curLine;

    public boolean processLine(String line) {
        // Task 1: Convert the string into an array of characters and clear the stack
        curLine = line.toCharArray();
        stack.clear();

        // Task 2: Loop through the array and check for matching parentheses
        for (char c : curLine) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    // Condition 2a: Pop operation on an empty stack, parentheses do not match
                    return false;
                }
                stack.pop();
            }
        }

        // Check for left parentheses on the stack after completing the loop
        // Condition 2b: Left parentheses left on the stack, parentheses do not match
        return stack.isEmpty();
    }

    public void processArray(String[] lines) {
        int count = 0;
        for (String line : lines) {
            if (this.processLine(line)) {
                System.out.println("Line " + count + " is valid");
            } else {
                System.out.println("Line " + count + " is invalid");
            }
            count++;
        }
    }

    public static void main(String[] args) {
        ParenMatcher pm = new ParenMatcher();
        String[] expressions = new String[4];

        expressions[0] = "if ((a == b) && (x != y));";
        expressions[1] = "if ((a == b) && (x != y)));";
        expressions[2] = "if ((firstName.equals(newFirstName) && (lastName.equals(newLastName));";
        expressions[3] = "if ((firstName.equals(newFirstName) && (lastName.equals(newLastName))));";

        pm.processArray(expressions);
    }
}
