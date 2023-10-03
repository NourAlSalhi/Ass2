import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Default Priority 0
public class AnnTest {
    @BeforeMethod
    public void printStatusBefore(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+" Print Status");
    }
    @Test(priority = 0)
    public void testSum(){
        Assert.assertTrue(true);
    }
    @Test(priority = 1)
    public void testDivision(){
        Assert.assertTrue(5==5);
    }
    @AfterMethod()
    public void printStatus(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+" Pass");
    }
}
