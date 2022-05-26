package com.sparta.ee.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

    /*
    Hannah likes to do many exercises, but especially the pullup. She is not very strong, but
    she pulls through. Her rotator muscles are also in very good health. Her brother, Martin,
    plays video games. In World of Warcraft, his character stats are super high. None of them
    help their dad to repaper the house, since she is always out, and he is always on his screen.
    In addition, he has a particular racecar that has high stats, on Ashphalt 8. They don't live
    with their mum, she lives on a river boat. Her cousin lives in the city Ubulubu, Nigeria
    and is married a guy from Paraparap, Paraparap, Australia.
     */

    public static String lowerCaseConverter(String someWords) {
        String toLowerCase = someWords.toLowerCase();
        return toLowerCase;

    }

    public static boolean isPalindromeChecker (String palindrome) {

        boolean isPalindrome = false;
        String palindromeLowerCase = Palindrome.lowerCaseConverter(palindrome);
        String reverseString = "";

        for (int i = palindromeLowerCase.length()-1; i >= 0; i--) {

            reverseString = reverseString + palindromeLowerCase.charAt(i);
        }


        if (palindrome.equals(reverseString) && palindrome.length() > 2) {

            isPalindrome = true;
        }
        else {
            isPalindrome = false;
        }
        return isPalindrome;
    }


    public static ArrayList<String> findLongestPalindrome (String sentence) {

        //ArrayList<String> arraySentence = new ArrayList<>();
        //sentence = Palindrome.stringToArrayList(Palindrome.lowerCaseConverter("This is it")));
        String sentenceLowerCase = Palindrome.lowerCaseConverter(sentence);
        String[] sentenceRemoveSpace = sentenceLowerCase.replaceAll("\\p{Punct}", "").split(" ");


        ArrayList<String> palindromeList = new ArrayList<>();
        ArrayList<String> longestPalindromeList = new ArrayList<>();

        int charCount = 0;

        for (String word : sentenceRemoveSpace) {
            if (word.length() > 2 && isPalindromeChecker(word) && !palindromeList.contains(word)) {
                palindromeList.add(word);
            }
        }

        for (String word : palindromeList) {
            if (word.length() > charCount) {
                charCount = word.length();
            }
        }

        for (String word : palindromeList) {
            if ((word.length() == charCount) && charCount >= 6) {
                longestPalindromeList.add(word);
            }

        }
        return longestPalindromeList;
    }



    public static void main (String[] args) {
        //System.out.println(Palindrome.palindromeChecker("aqb"));
        System.out.println(findLongestPalindrome("Hannah likes to do many exercises, but especially the pullup. She is not very strong, but\n" +
                "    she pulls through. Her rotator muscles are also in very good health. Her brother, Martin,\n" +
                "    plays video games. In World of Warcraft, his character stats are super high. None of them\n" +
                "    help their dad to repaper the house, since she is always out, and he is always on his screen.\n" +
                "    In addition, he has a particular racecar that has high stats, on Ashphalt 8. They don't live\n" +
                "    with their mum, she lives on a river boat. Her cousin lives in the city Ubulubu, Nigeria\n" +
                "    and is married a guy from Paraparap, Paraparap, uaraparau, Australia."));
    }
}
