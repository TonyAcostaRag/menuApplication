package calculadoraTest;

import com.calculadora.Calculadora;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngCalculator {

    @Test
    public void testOne_Suma () {
        Calculadora cal = new Calculadora();

        int num1 = 3;
        double num2 = 2.0;

        double result = cal.suma(num1, num2);
        Assert.assertEquals(result, 5.0);
    }

    @Test
    public void testTwo_Suma () {
        Calculadora cal = new Calculadora();

        int num1 = 3;
        double num2 = 2.0;

        double result = cal.suma(num1, num2);
        Assert.assertEquals(result, 5.0);
    }
}
