package Stacks;


import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses {

    private final Stack<Character> stack = new Stack<>();
    public static void main(String[] args) {

        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isParenthesisValid("((({{{[[[]]]]}}})))")); // ✅ True
        System.out.println(validParentheses.isParenthesisValid("{[()]}")); // ✅ True
        System.out.println(validParentheses.isParenthesisValid("{[(])}")); // ❌ False
        System.out.println(validParentheses.isParenthesisValid("{[}")); // ❌ False


    }


    public boolean isParenthesisValid(String p) {
        char[] bracketArray = p.toCharArray();

        for(char bracket : bracketArray ) {
            if(isCurrentBracketOpen(bracket)) {
                stack.push(bracket);
            } else if(!stack.isEmpty() && isCurrentBracketCLose(bracket) ) {
                if(stack.pop() != getCurrentEnum(bracket).getOpenBracket()) return false;
            } else return false;
        }
        return stack.isEmpty();
    }


    private boolean isCurrentBracketOpen(char bracket) {
        return Set.of(
                Brackets.CURLEY_BRACKET.getOpenBracket(),
                Brackets.ROUND_BRACKET.getOpenBracket(),
                Brackets.SQUARE_BRACKET.getOpenBracket()
        ).contains(bracket);
    }

    private boolean isCurrentBracketCLose(char bracket) {
        return Set.of(
                Brackets.CURLEY_BRACKET.getClosedBracket(),
                Brackets.ROUND_BRACKET.getClosedBracket(),
                Brackets.SQUARE_BRACKET.getClosedBracket()
        ).contains(bracket);
    }


    private Brackets getCurrentEnum(char currentBracket) {
        return switch(currentBracket) {
            case(')') -> Brackets.ROUND_BRACKET;
            case('}') -> Brackets.CURLEY_BRACKET;
            case (']') -> Brackets.SQUARE_BRACKET;
            default -> throw new NoSuchElementException("No element found");
        };

    }


}


enum Brackets {
    SQUARE_BRACKET('[', ']'),
    CURLEY_BRACKET('{', '}'),
    ROUND_BRACKET('(', ')');

    private final char  openBracket;
    private final char closedBracket;

    Brackets(char openBracket, char closedBracket) {
        this.openBracket = openBracket;
        this.closedBracket = closedBracket;
    }

    public char getOpenBracket() {
        return openBracket;
    }

    public char getClosedBracket() {
        return closedBracket;
    }
}

