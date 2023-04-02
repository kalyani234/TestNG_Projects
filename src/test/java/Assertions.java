import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions {


    WebDriver driver;
   @BeforeClass
    void setUp(){
       System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver\\chromedriver.exe");
         driver= new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   }

   @Test(priority = 1)
   void logoTest() throws InterruptedException {
       Thread.sleep(1000);
     WebElement logo=  driver.findElement(By.xpath("//img[@alt='company-branding']"));
     Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed");
   }

   @Test(priority = 2)
   void homePageTitle(){
       String title = driver.getTitle();
       Assert.assertEquals("OrangeHRM",title,"Title is not matched");
       Assert.assertEquals(title,"OrangeHRM","Title is not matched");
   }


   @Test(priority = 3)
   void login(){
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

   }


   @AfterClass
   void tearDown(){
       driver.quit();
   }

}
