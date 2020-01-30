import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void summTest() {
        Calc calc = new Calc();
        int result ;
        result = calc.summ(10,20);
        Assert.assertEquals(30, result);


    }
    @Test
    public void subTest() {
        Calc calc = new Calc();
        int result ;
        result = calc.sub(8,6);
        Assert.assertEquals(2, result);
    }
    @Test

    public void mult() {
        Calc calc = new Calc();
        int result ;
        result = calc.mult(4,2);
        Assert.assertEquals(8, result);

    }
    @Test
    public void div() {
        Calc calc = new Calc();
        int result ;
        result = calc.div(12,3);
        Assert.assertEquals(4, result);
    }

}
