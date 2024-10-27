package gsinterview;

import java.util.Stack;

public class BalancedSymbolsChecker {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening symbol
                }
                char lastOpened = stack.pop();
                if (!isMatchingPair(lastOpened, c)) {
                    return false; // Mismatched symbols
                }
            } else {
                return false; // Invalid character found
            }
        }

        return stack.isEmpty(); // True if all symbols are matched
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("()"));    // true
        System.out.println(isBalanced("{}"));    // true
        System.out.println(isBalanced("[]"));    // true
        System.out.println(isBalanced("(}"));    // false
        System.out.println(isBalanced("({[]})")); // true
        System.out.println(isBalanced("({[}])")); // false
        System.out.println(isBalanced("{[}]"));   // false
        System.out.println(isBalanced("(abc)"));  // false
    }
}

	