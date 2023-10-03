import org.testng.Assert;
import org.testng.annotations.Test;

//Default Priority 0
public class AnnTest {
    @Test(priority = 0)
    public void testSum(){
        Assert.assertTrue(true);
    }
    @Test(priority = 1)
    public void testDivision(){
        Assert.assertTrue(5==5);
    }
}
