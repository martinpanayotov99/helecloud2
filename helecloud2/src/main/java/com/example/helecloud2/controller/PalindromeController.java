package com.example.helecloud2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeController {


    @GetMapping("/is-palindrome")
    public String isPalindrome(@RequestParam String sentence) {
        return sentence + " -> "+ new Palindrome(sentence).isPalindrome();
    }
}
