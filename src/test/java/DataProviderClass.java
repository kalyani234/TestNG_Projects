import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

@Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
public void loginTest(String email, String  pwd){

    System.out.println(email + "" + pwd);
}


    //Create Set of data

//   @DataProvider(name= "LoginDataProvider")
//    public Object[][] getData(){
//
//        Object[][] data = {{"abc@gmail.com","abc"},{"xyz@gmail.com","wyz"},{"mno@gmail.com","mno"}};
//
//        return data;
//
//    }
}
