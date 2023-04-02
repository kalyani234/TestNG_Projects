import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTests {

    @Test
    void startCar(){
        System.out.println("start car");
        Assert.assertEquals(1,1);
    }


    @Test(dependsOnMethods = {"startCar"}) //If startCar is passed then only drive car will excute
    void driveCar(){
        System.out.println("drive car");
        Assert.assertEquals(1,2);

    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("stop car");
    }

    @Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun = true)
    void parkCar(){
        System.out.println("park car");
    }
}
