import org.testng.annotations.Test;

public class FirstTestCase {

    //Test Suites --> Test cases --> Test Steps

    //Every testcase should n=be annote by @Test

    /*
    Setup
    Login
    Close
     */

    @Test(priority = 1)
    void setUp() {
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("Login the browser");
    }

    @Test(priority = 3)
    void tearDown() {
        System.out.println("Close the browser");
    }
}
