/**
 * This class represents a calculator that can perform basic arithmetic operations.
 */
public class Calculator {
    
    /**
     * Adds two numbers together.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The sum of the two numbers.
     */
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    /**
     * Subtracts one number from another.
     *
     * @param num1 The number to subtract from.
     * @param num2 The number to subtract.
     * @return The result of the subtraction.
     */
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    /**
     * Multiplies two numbers together.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The product of the two numbers.
     */
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    /**
     * Divides one number by another.
     *
     * @param num1 The number to divide.
     * @param num2 The number to divide by.
     * @return The result of the division.
     * @throws ArithmeticException If the second number is zero.
     */
    public double divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) num1 / num2;
    }
}