package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07IlkDers {

    public static void main(String[] args) {

     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.manage().window().maximize();

     driver.get("https://www.amazon.com");

     WebElement searhBox = driver.findElement(By.id("twotabsearchtextbox"));
     searhBox.sendKeys("Samsung Headphones" + Keys.ENTER);

     WebElement sonucSayisi = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(sonucSayisi.getText());

    // WebElement ilkUrun = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71s+CTbFCiL._AC_UY218_.jpg']"));
     //ilkUrun.click();

     List<WebElement> tumUrunler = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement w : tumUrunler){
            System.out.println(w.getText());
        }




       driver.quit();








    }

}
