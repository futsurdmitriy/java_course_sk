package fuda.edu;

import java.util.logging.Logger;

public class PalindromeService {

    private static final Logger LOGGER =
            Logger.getLogger(PalindromeService.class.getName());

    private String string;
    private static final String regex = "[\\P{L}]+";

    public static Boolean isValid(String string) {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        
        LOGGER.info("INFO: method " + methodName + " was called");
        if (string == null) return null;

        PalindromeService palindromeService = new PalindromeService();
        palindromeService.setString(string);
        palindromeService.toLowerCase();
        palindromeService.getCleanedString();

        System.out.println(palindromeService.getString());
        System.out.println(palindromeService.getReversed());

        if (palindromeService.getString().length() == 0) return false;
        return palindromeService
                .getString()
                .equals(palindromeService.getReversed());
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public PalindromeService() {
    }

    public PalindromeService(String string) {
        this.string = string;
    }

    private void toLowerCase() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        LOGGER.info("INFO: method " + methodName + " was called");
        this.setString(this.string.toLowerCase());
    }

    private void getCleanedString() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        LOGGER.info("INFO: method " + methodName + " was called");
        this.setString(this.string.replaceAll(regex, ""));
    }

    private String getReversed() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        LOGGER.info("INFO: method " + methodName + " was called");
        return new StringBuilder(string).reverse().toString();
    }

    /*public Boolean isValid() {
        toLowerCase();
        getCleanedString();
        return this.getString().equals(this.getReversed());
    }*/
}
