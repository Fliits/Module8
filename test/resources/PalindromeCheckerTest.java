import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void canRecogniseCapitalisation() {
        assertTrue(PalindromeChecker.isPalindrome("Madam"));
    }

    @Test
    void canRecognisePunctuation() {
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama!"));
    }

    @Test
    void canRecogniseNonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("Hello, World!"));
    }

    @Test
    void canRecogniseEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    void canRecogniseSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }

    @Test
    void canRecognisePalindromeWithNumbers() {
        assertTrue(PalindromeChecker.isPalindrome("12321"));
    }

    @Test
    void canRecogniseNonPalindromeWithNumbers() {
        assertFalse(PalindromeChecker.isPalindrome("12345"));
    }

    @Test
    void canRecognisePalindromeWithMixedCaseAndPunctuation() {
        assertTrue(PalindromeChecker.isPalindrome("No 'x' in Nixon"));
    }
}