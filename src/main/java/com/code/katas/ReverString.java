package com.code.katas;

public class ReverString {

    public String getReverseString(String input){
        String revserString="";
        char ch[]=input.toCharArray();

        for(int i=ch.length-1;i>=0;i--){
            revserString+=ch[i];
        }
        return revserString;
    }
}
