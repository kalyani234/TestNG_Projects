import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomDataProvider {



    //Create the set of values
    @DataProvider(name= "LoginDataProvider")
    public Object[][] getData(){

        Object[][] data = {{"abc@gmail.com","abc"},{"xyz@gmail.com","wyz"},{"mno@gmail.com","mno"}};

        return data;

    }
}
