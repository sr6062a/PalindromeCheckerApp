import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Choose strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/* Strategy Interface */
interface PalindromeStrategy {
    boolean check(String input);
}

/* Stack-based strategy implementation */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters with stack pop
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}