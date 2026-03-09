public class StringManipulator {
    public StringManipulator() {
    }
    public String concatenate(String str1, String str2) {
        String str1and2 = str1 + str2;
        return str1and2;
    }

    public Integer findLength(String str) {
        Integer length = str.length();
        return length;
    }

    public String convertToUpperCase(String str) {
        String upperCaseStr = str.toUpperCase();
        return upperCaseStr;
    }

    public String convertToLowerCase(String str) {
        String lowerCaseStr = str.toLowerCase();
        return lowerCaseStr;
    }

    public boolean containsSubstring(String str, String substring) {
        boolean contains = str.contains(substring);
        return contains;
    }
}
