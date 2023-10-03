import org.example.LengthString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LengthStringTest {
    @DataProvider (name = "dataLength")
    public Object [] [] dataString (){
       return new Object[][] {
               {"Nour",4},
               {" Nour", 4},
               {" Nour ",4},
               {"No a ur",7},
               {" ",0},
               {"",0}

       };
    };
    @Test(dataProvider = "dataLength")
    public void testGetLength(String text,int expected) {
       LengthString getLength1 = new LengthString();
       int length = getLength1.getLength(text);
       Assert.assertEquals(length,expected);
    }
    @Test
    public void testDivision6(){
        Assert.assertTrue(5==5);
    }

    @Test
    public void testDivision7(){
        Assert.assertTrue(5==5);
    }

    @Test
    public void testDivision8(){
        Assert.assertTrue(5==5);
    }
}
