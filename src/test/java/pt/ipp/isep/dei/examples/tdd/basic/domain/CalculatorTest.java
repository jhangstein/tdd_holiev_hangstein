package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

/*    @BeforeAll
    public static void classSetUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place before any @Test is executed");
    }

    @AfterAll
    public static void classTearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place after all @Test are executed");
    }

    @BeforeEach
    public void setUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place before each @Test is executed");
    }

    @AfterEach
    public void tearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place after each @Test is executed");
    }

    @Test
    @Disabled
    public void failingTest() {
        fail("a disabled failing test");
    }*/


    @Test
    @DisplayName("Ensure 7 + 3 = 10")
    public void ensureSevenPlusThreeEqualsTen() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 10;
        int firstOperand = 7;
        int secondOperand = 3;

        int result = new Calculator().sum(firstOperand, secondOperand);

        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Ensure 3 + -6 = -3")
    public void ensureThreePlusMinusSixEqualsMinusThree() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = -3;

        int result = new Calculator().sum(3, -6);

        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Ensure 0 + 3 = 3")
    public void ensureZeroPlusThreeEqualsThree() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = 3;

        int result = new Calculator().sum(0, 3);

        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Ensure 13 - 3 = 10")
    public void ensureThirteenMinusThreeEqualsTen() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = 10;

        int result = new Calculator().subtract(13, 3);

        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Ensure 3 - 6 = -3")
    public void ensureThreeMinusSixEqualsMinusThree() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = -3;

        int result = new Calculator().subtract(3, 6);

        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Ensure 5 - 0 = 5")
    public void ensureFiveMinusZeroEqualsFive() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = 5;

        int result = new Calculator().subtract(5, 0);

        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Even integer division")
    public void ensureTenDividedByFiveEqualsTwo() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = 2;

        int result = new Calculator().divide(10, 5);

        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Proper Integer truncation")
    public void ensureDivisionResultIsTruncated() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = 0;

        int result = new Calculator().divide(3, 4);

        assertEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Division by zero throws Exception")
    public void ensureDivisionByZeroThrowsException() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            new Calculator().divide(8, 0);
        });

    }


    @Test
    @DisplayName("Dividing by negative number")
    public void ensureFiveDividedByMinusOneEqualsMinusFive() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = -5;

        int result = new Calculator().divide(5, -1);

        assertEquals(expectedResult, result);
    }
}



