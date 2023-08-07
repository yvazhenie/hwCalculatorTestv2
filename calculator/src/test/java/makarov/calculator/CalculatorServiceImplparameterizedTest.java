package makarov.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplparameterizedTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.stringResult(2, 2, "4", "+")),
                Arguments.of(25, 3, TestUtils.stringResult(25, 3, "28", "+")),
                Arguments.of(3, 3, TestUtils.stringResult(3, 3, "6", "+"))
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(int num1, int num2, String expectedResult) {
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(2, 1, TestUtils.stringResult(2, 1, "1", "-")),
                Arguments.of(7, 8, TestUtils.stringResult(7, 8, "-1", "-")),
                Arguments.of(5, 1, TestUtils.stringResult(5, 1, "4", "-"))
        );
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(int num1, int num2, String expectedResult) {
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(3, 2, TestUtils.stringResult(3, 2, "6", "*")),
                Arguments.of(2, 1, TestUtils.stringResult(2, 1, "2", "*")),
                Arguments.of(13, 1, TestUtils.stringResult(13, 1, "13", "*"))
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, String expectedResult) {
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(11, 11, TestUtils.stringResult(11, 11, "1.0", "/")),
                Arguments.of(0, 23, TestUtils.stringResult(0, 23, "0.0", "/")),
                Arguments.of(10, 5, TestUtils.stringResult(10, 5, "2.0", "/"))
        );
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, String expectedResult) {
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}
