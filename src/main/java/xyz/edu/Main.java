package xyz.edu;

public class Main {
    public static void main(String[] args) {
        String abba = "ABbA";
        PalindromeService palindromeService = new PalindromeService(abba);
        System.out.println(palindromeService.isValid());
        PalindromeService.isValid(abba);

        // static method
        // encapsulated logic to check palindrome
        // logger for each method and test for each method
        // cyrillic check also implement
    }
}
