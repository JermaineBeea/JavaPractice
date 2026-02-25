package za.co.wethinkcode;

public class Katas {

    /** PROBLEM 1
     * Sort the digits of a number in descending order.
     * Given a number, return the number with its digits sorted in descending order.
     * For example, given the number 12345, return 54321.
     * Note: The number may be negative, in which case the sign should be preserved.
     * For example, given the number -12345, return -54321.
     * Constraints: The number will be a 32-bit signed integer.
     * The number will not be zero.
     */
    static int descendingOrder(int number) {
        // TODO: Implement this method
        return 0;
    }

    /** PROBLEM 2
     * Convert a string with words separated by non-alphabetic characters into camel case format.
     * Given a string, return the camel case formatted string where the first word remains unchanged
     * and each subsequent word starts with an uppercase letter, with all separators removed.
     * For example, given "the-stealth-warrior", return "theStealthWarrior".
     * For example, given "The_Stealth_Warrior", return "TheStealthWarrior".
     * Constraints: Separators will only be '-' or '_'.
     * The string will not be empty.
     */
    static String toCamelCase(String s) {
        // TODO: Implement this method
        return "";
    }

    /** PROBLEM 3
     * Count the number of vowels in a string.
     * Given a string, return the number of vowels in the string.
     * For example, given the string "hello world", return 3.
     * Note: The string may contain uppercase and lowercase letters.
     * For example, given the string "Hello World", return 3.
     * Constraints: Vowels are a, e, i, o, u (case insensitive).
     * The string may be empty, in which case return 0.
     */
    public static int vowelCount(String str) {
        // TODO: Implement this method
        return 0;
    }

    /** PROBLEM 4
     * Find the next perfect square after a given number.
     * Given a number, return the next perfect square after it.
     * For example, given the number 4, return 9.
     * Note: If the number is not a perfect square, return -1.
     * For example, given the number 7, return -1.
     * Constraints: The number will be a non-negative integer.
     */
    public static int findNextSquare(int number) {
        // TODO: Implement this method
        return 0;
    }

    /** PROBLEM 5
     * Find the longest sorted string of distinct letters from two strings.
     * Given two strings containing only letters a-z, return a new sorted string
     * containing distinct letters taken only once from either string.
     * For example, given "xyaabbbccccdefww" and "xyaabbbccccdefww", return "abcdefwxy".
     * For example, given "abcdefghijklmnopqrstuvwxyz" and "abcdefghijklmnopqrstuvwxyz",
     * return "abcdefghijklmnopqrstuvwxyz".
     * Constraints: Strings will only contain lowercase letters a-z.
     * Either string may be empty.
     */
    static String uniqueLetters(String str1, String str2) {
        // TODO: Implement this method
        return "";
    }

    /** PROBLEM 6
     * Create a phone number string from an array of 10 integers.
     * Given an array of 10 integers between 0 and 9, return a string formatted as a phone number.
     * For example, given [1,2,3,4,5,6,7,8,9,0], return "(123) 456-7890".
     * Note: The numbers in the array are not necessarily distinct.
     * Constraints: The array will always contain exactly 10 integers.
     * Each integer will be between 0 and 9 inclusive.
     */
    static String createPhoneNumber(int[] numbers) {
        // TODO: Implement this method
        return "";
    }

    /** PROBLEM 7
     * Detect whether a string is a pangram.
     * A pangram is a sentence that contains every letter of the alphabet at least once.
     * Given a string, return true if it is a pangram, false otherwise.
     * For example, given "The quick brown fox jumps over the lazy dog", return true.
     * Note: Case is irrelevant. Numbers and punctuation are ignored.
     * Constraints: The string may be empty, in which case return false.
     */
    static boolean pangram(String sentence) {
        // TODO: Implement this method
        return false;
    }

    /** PROBLEM 8
     * Find the outlier integer in an array of otherwise all-odd or all-even integers.
     * Given an array of integers that is entirely odd or entirely even except for one integer,
     * return that outlier integer.
     * For example, given [2,4,0,100,4,11,2602,36], return 11 (the only odd number).
     * For example, given [160,3,1719,19,11,13,-21], return 160 (the only even number).
     * Constraints: The array will have a length of at least 3.
     * There will always be exactly one outlier.
     */
    static int findOutlier(int[] integers) {
        // TODO: Implement this method
        return 0;
    }

    /** PROBLEM 9
     * Find the highest and lowest numbers in a string of space-separated numbers.
     * Given a string of space-separated numbers, return the highest and lowest numbers
     * as a string separated by a single space, with the highest number first.
     * For example, given "1 2 3 4 5", return "5 1".
     * For example, given "1 2 -3 4 5", return "5 -3".
     * Constraints: There will always be at least one number in the input string.
     * Numbers may be negative.
     */
    public static String highAndLow(String numbers) {
        // TODO: Implement this method
        return "";
    }
}