public class PalindromeChecker {
    private static boolean palindrome;

    public PalindromeChecker() {
        this.palindrome = false;
    }

    public static boolean isPalindrome(String input) {
        //TODO modify function to handle numbers
        if (input == null) {
            return false;
        }
        if (input.isEmpty()) {
            return true;
        }
        if (input.length() == 1) {
            return true;
        }
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanInput).reverse().toString();
        System.out.println(reversedInput);
        palindrome = cleanInput.equals(reversedInput);
        return palindrome;
    }
}
