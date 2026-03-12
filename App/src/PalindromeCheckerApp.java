public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        boolean result = checkString(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    // Recursive method
    private static boolean checkString(String s, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkString(s, start + 1, end - 1);
    }
}