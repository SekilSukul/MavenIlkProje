package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08IkinciOrnek {

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
    public void testtenOnce(){
        driver.get("http:google.com");

    }


    @After
    public void testtenSonra(){
        WebElement results = driver.findElement(By.id("result-stats"));
        System.out.println(results.getText());
    }



    @Test
    public void Test1(){
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("elma");
        searchBox.submit();

   }



   @Test
    public void Test2(){
       WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("armut");
        searchBox.submit();
   }


    @Test
    public void Test3(){
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("karpuz");
        searchBox.submit();
    }



}
