package makarov.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void plus_first_success() {
        //подготовка
        int num1 = 1;
        int num2 = 3;

        //подготовка
        String expectedResult = TestUtils.stringResult(1, 3, "4", "+");

        //начало теста
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus_second_success() {
        //подготовка
        int num1 = 11;
        int num2 = 7;

        //подготовка
        String expectedResult = TestUtils.stringResult(11, 7, "18", "+");

        //начало теста
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    void minus_first_success() {
        //подготовка
        int num1 = 9;
        int num2 = 8;

        //подготовка
        String expectedResult = TestUtils.stringResult(9, 8, "1", "-");

        //начало теста
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void minus_second_success() {
        //подготовка
        int num1 = 7;
        int num2 = 8;

        //подготовка
        String expectedResult = TestUtils.stringResult(7, 8, "-1", "-");

        //начало теста
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_first_success() {
        //подготовка
        int num1 = 11;
        int num2 = 2;

        //подготовка
        String expectedResult = TestUtils.stringResult(11, 2, "22", "*");

        //начало теста
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void multiply_second_success() {
        //подготовка
        int num1 = 3;
        int num2 = 3;

        //подготовка
        String expectedResult = TestUtils.stringResult(3, 3, "9", "*");

        //начало теста
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_success() {
        //подготовка
        int num1 = 4;
        int num2 = 2;

        //подготовка
        String expectedResult = TestUtils.stringResult(4, 2, "2.0", "/");

        //начало теста
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_withException() {
        //подготовка
        int num1 = 4;
        int num2 = 0;

        //подготовка
        String expectedMessage = "Нельзя делить на ноль";

        //начало теста
        Exception exception = assertThrows(IllegalStateException.class,
                () -> calculatorService.divide(num1, num2));
        assertEquals(expectedMessage, exception.getMessage());
    }
}
