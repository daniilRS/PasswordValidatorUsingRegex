package org.arpit.java2blog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexCurrencySymbol {

    public static void main(String args[]) {
        String password1 = "daniil_rs";

        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        boolean validPassword = isValidPassword(password1,regex);
        System.out.println("daniil_rs is valid password:" +validPassword);

        String password2 = "helloworld_@!#444";

        String regex1 = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        boolean validPassword1 = isValidPassword(password2,regex1);
        // No upper case
        System.out.println("helloworld_@!#444 is valid password:" +validPassword1);
    }

    public static boolean isValidPassword(String password,String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}