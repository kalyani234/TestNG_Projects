package Paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParalleTests {

WebDriver driver;

    @Test(priority = 1)
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        WebElement logo=  driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed");
    }


    @Test(priority = 2)
    void getTitle() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM",title,"Title is not matched");
        Thread.sleep(3000);

    }


    @AfterMethod
    void tearDown(){
//        driver.close();
        driver.quit();
    }
}
