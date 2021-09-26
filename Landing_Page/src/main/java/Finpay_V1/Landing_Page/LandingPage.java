package Finpay_V1.Landing_Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LandingPage 
{
    public static void main( String[] args )
    {
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.finpay.com");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      WebElement abtNav= driver.findElement(By.xpath("//ul[@class='submenu level-1']/li[1]"));
      abtNav.click();
      
    }
}
