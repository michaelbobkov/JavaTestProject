import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDivisionShould(){
        MyMath.divide(1,0);
    }
}
