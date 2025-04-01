package Stacks;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Stack;

public class ParenthesesValidator {
    private static final Set<Character> OPENING_BRACKETS = Set.of('[', '{', '(');
    Stack<Character> parenthesesChar = new Stack<>();

    public static void main(String[] args) {
        String p1 = "((({{{[[[]]]]}}})))";
        ParenthesesValidator validator = new ParenthesesValidator();
        System.out.println(validator.checkParenthesisValid(p1));
        System.out.println(validator.checkParenthesisValid("()"));              // true
        System.out.println(validator.checkParenthesisValid("[]"));              // true
        System.out.println(validator.checkParenthesisValid("{}"));              // true
        System.out.println(validator.checkParenthesisValid("({[]})"));          // true
        System.out.println(validator.checkParenthesisValid("(({{[[()]]}}))"));  // true
        System.out.println(validator.checkParenthesisValid("{[()]}"));          // true
        System.out.println(validator.checkParenthesisValid("{{{{{}}}}}"));      // true

        System.out.println(validator.checkParenthesisValid("("));               // false (missing closing)
        System.out.println(validator.checkParenthesisValid(")"));               // false (no opening bracket)
        System.out.println(validator.checkParenthesisValid("({[)]}"));          // false (incorrect nesting)
        System.out.println(validator.checkParenthesisValid("{[(])}"));          // false (wrongly ordered)
        System.out.println(validator.checkParenthesisValid("{[}"));             // false (mismatched)
        System.out.println(validator.checkParenthesisValid("((())"));           // false (missing closing)
        System.out.println(validator.checkParenthesisValid(")))"));             // false (extra closing brackets)
        System.out.println(validator.checkParenthesisValid("{}[][([0"));

    }


    public boolean checkParenthesisValid(String p1) {
        char[] p = p1.toCharArray();

        for (char c : p) {
            if (isOpeningBracket(c)) parenthesesChar.push(c);
            else if (parenthesesChar.isEmpty() || getOpeningBracket(c) != parenthesesChar.peek()) return false;
            else parenthesesChar.pop();
        }

        return parenthesesChar.isEmpty();

    }

    public boolean isOpeningBracket(char c) {
        return OPENING_BRACKETS.contains(c);
    }

    public char getOpeningBracket(char closingBracket) {
        return switch(closingBracket) {
            case '}' -> '{';
            case ']' -> '[';
            case ')' -> '(';
            default -> throw new NoSuchElementException("Moye Moye ho gaya hai ");
        };
    }
}
