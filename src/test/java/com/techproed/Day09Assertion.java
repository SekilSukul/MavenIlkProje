package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09Assertion {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }



    @Test
    @Ignore
    public void test01(){
        driver.get("http://google.com");

        String title = driver.getTitle();

        System.out.println(driver.getTitle());

        if (title.contains("Google")){
            System.out.println("Title'da Google Var");
        }else{
            System.out.println("Title'da Google Yok");
        }
    }


    @Test
    public void test02(){
        driver.get("http://google.com");
        String title = driver.getTitle();

        Assert.assertEquals("Google Arama Sayfasi",title);

    }

    @Test
    public void test03(){
        driver.get("http://amazon.com");
        String title = driver.getTitle();

        boolean amazonBaslik = title.contains("Amazon");
        Assert.assertTrue(true);

    }

    @Test
    public void test04(){
        driver.get("http://facebook.com");
        String title = driver.getTitle();

        boolean facebookTitle = title.contains("Youtube");
        Assert.assertFalse(facebookTitle);
    }

    @Test
    public void test05(){
        driver.get("http://google.com");
        String title = driver.getTitle();

        Assert.assertEquals("Google", title);
        System.out.println("Test Bitti");
    }









    @AfterClass
    public static void tearDown(){
        driver.quit();
    }



}



