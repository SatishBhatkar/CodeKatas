package com.code.katas;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Palindrome {


    public Boolean getPalindrome(String strInput){
        String revstring="";
        Boolean isPalindrome=false;
        for(int i=strInput.length()-1;i>=0;--i){
            revstring +=strInput.charAt(i);
        }

        if(revstring.equalsIgnoreCase(strInput)){
            isPalindrome=true;
        }

        return isPalindrome;
    }

}
