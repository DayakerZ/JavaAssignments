package com.assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence = scanner.nextLine();
        checkIfStartsWithCapitalAndEndsWithPeriod(sentence);
    }

    private static void checkIfStartsWithCapitalAndEndsWithPeriod(String sentence) {
        Pattern pattern = Pattern.compile("[A-Z].+[.]");
        Matcher matcher = pattern.matcher(sentence);
        if(matcher.find()&& matcher.group().equals(sentence))
        {
            System.out.println("It starts with a capital letter and ends with a period(dot)");
        }
        else
            System.out.println("Not satisfied the conditions ..hard luck!");
    }
}
