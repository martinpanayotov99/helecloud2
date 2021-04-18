package com.example.helecloud2.controller;

public class Palindrome {

    private String sentence;

    public Palindrome(String sentence) {
        this.sentence = sentence;
    }

    public boolean isPalindrome() {
        int frontIndex = 0;
        int backIndex = sentence.length() - 1;

        while (frontIndex < backIndex) {
            while (sentence.charAt(frontIndex) == ' ' || sentence.charAt(frontIndex) == ',') {
                frontIndex++;
            }
            while (sentence.charAt(backIndex) == ' ' || sentence.charAt(backIndex) == ',') {
                frontIndex--;
            }

            char frontChar = Character.toLowerCase(sentence.charAt(frontIndex));
            char backChar = Character.toLowerCase(sentence.charAt(backIndex));

            if (frontChar != backChar)
                return false;
            frontIndex++;
            backIndex--;
        }
        return true;
    }
}
