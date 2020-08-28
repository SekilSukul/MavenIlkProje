package com.techproed;

import org.junit.*;

public class Day08BeforeAfterMehod {

    @Before
    public void setUp(){
        System.out.println("setUp calisti");
    }



    @Test
    public void test1(){
        System.out.println("Test calisti");
    }

    @Test
    public void test2(){
        System.out.println("Test2 calisti");
    }




    @After
    public void tearDown(){
        System.out.println("tearDown calisti");
    }












}
