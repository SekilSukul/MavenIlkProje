package com.techproed;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Day08BeforeAfterClass {


    @BeforeClass
    public static void setUp(){
        System.out.println("setUp calisti");
    }






    @Test
    public void test1(){
        System.out.println("Test1 Calisti");
    }







    @AfterClass
    public static void tearDown(){
        System.out.println("tearDown Calisti");
    }

}
