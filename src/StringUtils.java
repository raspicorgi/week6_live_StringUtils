public interface StringUtils {

    /*
     * Idea: A bunch of string utility functions. Don't use the built-in
     * tools from String etc, build it yourself from the ground up. Think
     * about optimization and elegant algorithms for string manipulation.
     */

    // Basic string operations
    String reverseString(String input);
    int countVowels(String input);
    String toUpperCase(String input);
    String toLowerCase(String input);

    // Substring operations
    boolean containsSubstring(String input, String substring);
    String[] splitString(String input, char delimiter);
    String joinStrings(String[] strings, char delimiter);

    // Palindrome operations
    boolean isPalindrome(String input);

    // Anagram operations
    boolean areAnagrams(String string1, String string2);

    // Custom string operations
    String removeWhitespaces(String input);
    String capitalizeFirstLetter(String input);

    /*
     * Additional ideas: Implement more string manipulation functions as needed.
     */
}