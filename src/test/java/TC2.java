import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute for Before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute for after class");
    }
    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will excute for every Before method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This will excute for every after method");
    }

    @Test
    void test3() {
        System.out.println("This is the test3");
    }

    @Test
    void test4() {
        System.out.println("This is the test4");
    }
}
