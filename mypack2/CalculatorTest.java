package mypack2;

import mypack1.Calculator;

public class CalculatorTest {
    public static void main(String args[]){
        Calculator calculator = new Calculator();

        int sum = calculator.add(10,20);
        System.out.println(sum);
    }
}
