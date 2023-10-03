import org.example.LengthString;
import org.example.divisionNumber;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivsionTest {
    @DataProvider(name = "Valid_Data")
    public Object [] [] validData (){
        return new Object[][] {
                {4.0f,4.0f},
        };
    };
    @DataProvider(name = "Invalid_Data")
    public Object [] [] invalidData (){
        return new Object[][] {
                {4.0f,0.0f},
        };
    };
    @Test(dataProvider = "Valid_Data")
    public void testValidData(float x, float y) {
        divisionNumber Divsion = new divisionNumber();
        Divsion.divsion(x,y);
    }
    @Test(dataProvider = "Invalid_Data",expectedExceptions = ArithmeticException.class)
    public void testInvalidData(float x, float y) {
        divisionNumber Divsion = new divisionNumber();
        Divsion.divsion(x,y);
    }
}
