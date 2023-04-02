import org.testng.annotations.Test;

public class GroupingTests {


    @Test(groups = {"sanity"})
    void test1(){
        System.out.println("This is to execute test1......");
    }

    @Test(groups = {"sanity"})
    void test2(){
        System.out.println("This is to execute test2......");
    }

    @Test(groups = {"regression"})
    void test3(){
        System.out.println("This is to execute test3......");
    }

    @Test(groups = {"regression"})
    void test4(){
        System.out.println("This is to execute test4......");
    }

    @Test(groups = {"sanity","regression"})
    void test5(){
        System.out.println("This is to execute test5......");
    }
}
