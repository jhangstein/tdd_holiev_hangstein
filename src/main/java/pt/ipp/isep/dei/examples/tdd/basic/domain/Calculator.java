package pt.ipp.isep.dei.examples.tdd.basic.domain;

/**
 * Calculator class.
 * This class is very simple in order to demonstrate how to build test cases for Unit Testing.
 */
public class Calculator {

    /**
     * Sums one operand to the other, returning the result.
     *
     * @param firstOperand  First operand to sum.
     * @param secondOperand Second Operand to sum.
     * @return The sum of firstOperand with secondOperand.
     */
    public int sum(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    public int subtract(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0){
            throw new UnsupportedOperationException("Can't divide by zero.");
        }
        return dividend/divisor;
    }

    public int multiply(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    public int factorial(int firstOperand) {
        if(firstOperand == 0){
            return 1;
        }

        if (firstOperand < 0){
            throw new UnsupportedOperationException("Operand must be either positive or 0");
        }

        int result = 1;

        while (firstOperand > 1){
            result = result * firstOperand;
            firstOperand--;
        }

        return result;
    }
}
