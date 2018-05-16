package com.code.katas;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PalindromeTest {


    Palindrome palindrome= new Palindrome();
    @Test
    public void isPalindromeString(){
        Boolean isPalindrome=false;
        isPalindrome =palindrome.getPalindrome("Naman");
        assertThat(true,equalTo(isPalindrome));
    }

    @Test
    public void isNotPalindromeString(){
        Boolean isPalindrome=false;
        isPalindrome =palindrome.getPalindrome("Chetan");
        assertThat(false,equalTo(isPalindrome));
    }
}
