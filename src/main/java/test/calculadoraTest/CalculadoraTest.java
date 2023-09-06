package test.calculadoraTest;

import com.calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void test_sum() {

        Calculadora cal = new Calculadora();

        cal.setNum1(2);
        cal.setNum2(3);
        double result = cal.suma(cal.getNum1(), cal.getNum2());

        Assert.assertEquals(5.0, result, 0.0);
    }

    @Test
    public void test_resta() {
        Calculadora cal = new Calculadora();

        cal.setNum1(2);
        cal.setNum2(10);
        double result = cal.resta(cal.getNum1(), cal.getNum2());

        Assert.assertEquals(-8.0, result, 0.0);
    }

    @Test
    public void test_multiplication() {
        Calculadora cal = new Calculadora();

        cal.setNum1(4);
        cal.setNum2(3);
        double result = cal.multiplicacion(cal.getNum1(), cal.getNum2());

        Assert.assertEquals(12.0, result, 0.0);
    }

    @Test
    public void test_division() {
        Calculadora cal = new Calculadora();

        cal.setNum1(4);
        cal.setNum2(2);
        double result = cal.division(cal.getNum1(), cal.getNum2());

        Assert.assertEquals(2.0, result, 0.0);
    }

    @Test
    public void test_divisionByZero() {
        Calculadora cal = new Calculadora();

        cal.setNum1(4);
        cal.setNum2(0);
        double result = cal.division(cal.getNum1(), cal.getNum2());

        Assert.assertEquals("Divide by zero gives infinity as result", true, Double.isInfinite(result));
    }

}
