import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    //Test Suites --> Test cases --> Test Steps

    //Every testcase should n=be annote by @Test

    /*
    Setup
    Login
    Close
     */

    @Test(priority = 1)
    void tearDown() {
        System.out.println("Opening browser");

    }


    @Test(priority = 2)
    void addCustomer() {
        System.out.println("Adding the customer");
    }

    @Test(priority = 3)
    void searchCustomer() {
        System.out.println("Search the browser");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 4, enabled = false)
    void closeBrowser() {
        System.out.println("Close the browser");
    }
}
