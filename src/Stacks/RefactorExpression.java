package Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RefactorExpression {

    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');


    public boolean isBalanced(String input) {
        java.util.Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.isEmpty()) return false;

                var top = stack.pop();
                if (!bracketsMatch(top, ch)
                ) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftBracket(char ch) {
       return leftBrackets.contains(ch);
//        return (ch == '(' || ch == '<' || ch == '[' || ch == '{');
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
//        return (ch == ')' || ch == '>' || ch == ']' || ch == '}');
    }

    private boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
//        return (right == ')' && left != '(') ||
//                (right == '>' && left != '<') ||
//                (right == ']' && left != '[') ||
//                (right == '}' && left != '{');
    }
}
