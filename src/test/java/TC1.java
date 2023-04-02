import org.testng.annotations.*;

public class TC1 {

   @BeforeTest
    void beforeTest(){
        System.out.println("This will execute for Before test");
    }


    @AfterTest
    void afterTest(){
        System.out.println("This will execute for after test");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute for Before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute for after Class");
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
    void test1() {
        System.out.println("This is the test1");
    }

    @Test
    void test2() {
        System.out.println("This is the test2");
    }
}
