package com.code.katas;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ReverseStringTest {

    ReverString reverString=new ReverString();

    @Test
    public void getReverseString(){

        String out=reverString.getReverseString("abcd");
        assertThat("dcba",equalTo(out));
    }
}
