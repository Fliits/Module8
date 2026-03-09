import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void canConcatenate() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.concatenate("Hello, ", "world!");
        assertEquals("Hello, world!", result);
        String result2 = manipulator.concatenate(result, "");
        assertEquals("Hello, world!", result2);
    }

    @Test
    void canConvertToUpperCaseAndLowerCase() {
        StringManipulator manipulator = new StringManipulator();
        String upperCaseResult = manipulator.convertToUpperCase("Hello");
        assertEquals("HELLO", upperCaseResult);
        String lowerCaseResult = manipulator.convertToLowerCase(upperCaseResult);
        assertEquals("hello", lowerCaseResult);
    }

    @Test
    void canFindLength() {
        StringManipulator manipulator = new StringManipulator();
        Integer length = manipulator.findLength("Hello");
        assertEquals(5, length);
        Integer length2 = manipulator.findLength("");
        assertEquals(0, length2);
    }

    @Test
    void canFindSubstring() {
        StringManipulator manipulator = new StringManipulator();
        boolean contains = manipulator.containsSubstring("Hello, world!", "world");
        assertTrue(contains);
        boolean notContains = manipulator.containsSubstring("Hello, world!", "Java");
        assertFalse(notContains);
    }

}