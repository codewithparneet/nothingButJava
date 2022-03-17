package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamedCapturingGroups {

    public static void main(String[] args) {
        String sampleString = "11-10101-111000";

        String regex = "(?<globalCode>[\\d]{2})-(?<nationalCode>[\\d]{5})-(?<number>[\\d]{6})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sampleString);
        if (matcher.find()) { // calling the find method in important to trigger matcher to look for matches; won't work
            // without calling the find method.
            System.out.println("Global code: " + matcher.group("globalCode"));
            System.out.println("National code: " + matcher.group("nationalCode"));
            System.out.println("Phone number: " + matcher.group("number"));
        }
    }
}
