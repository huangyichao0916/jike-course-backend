package com.hyc.utils;

import com.sun.tools.javac.code.Attribute;
import org.junit.Test;

public class TestConstsGetter {
    @Test
    public void testGetConsts() {
        try {
            Class.forName("com.hyc.utils.ConstsGetter");
            System.out.println(ConstsGetter.getConsts("baseUrl"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
