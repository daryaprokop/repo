import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testSum() {
        int expectedResult = 100;
        int actualResult = Calculator.sum(60, 40);
        Assertions.assertEquals(expectedResult, actualResult, "Результат сложения");
    }

    @Test
    void testSubstract(){
        int expectedResult = 60;
        int actualResult = Calculator.subtract(100, 40);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testMultiply(){
        int exp = 100;
        int act = Calculator.multiply(50,2);
        Assertions.assertEquals(exp, act, "Результат умножения");
    }

    @Test
    void testDivide(){
        int exp = 2;
        int act = Calculator.divide(1000,500);
        Assertions.assertEquals(exp, act, "Результат деления");
    }

    @Test
    void testAverage(){
        double exp = 55.25;
        double act = Calculator.average(60.5, 50.0);
        Assertions.assertEquals(exp, act, "Результат (a+b)/2");
    }

    @Test
    void testNegativeDivide(){
        int expected = 50;
        int actual = Calculator.divide(100, 3);
        Assertions.assertEquals(expected, actual, "Ошибка при делении");
    }
}
