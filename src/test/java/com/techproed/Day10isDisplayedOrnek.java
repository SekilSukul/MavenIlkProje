package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10isDisplayedOrnek {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    @Before
    public void before(){
        driver.get("http://bestbuy.com");

    }

    @After
    public void after(){
       // driver.quit();
    }



    @Test
    public void test1(){

     String s = driver.getTitle();
        boolean bestWord = s.contains("Best");
        Assert.assertTrue(bestWord);
    }


    @Test
    public void test2(){

        WebElement logo = driver.findElement(By.xpath("//img[@src='https://www.bestbuy.com/~assets/bby/_com/header-footer/images/bby_logo-a7e90594729ed2e119331378def6c97e.png']"));
        boolean logoIsExcist = logo.isDisplayed();
        Assert.assertTrue(logoIsExcist);



    }


    @Test
    public void test3(){

        WebElement mexico = driver.findElement(By.xpath("//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/mexico.svg']"));
        boolean mexcioIsExcist = mexico.isDisplayed();
        Assert.assertTrue(mexcioIsExcist);

    }



















    }
















