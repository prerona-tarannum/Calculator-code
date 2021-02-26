package com.company;
class Calculator {
    int num1;
    int num2;
    int value;
    public void add (int num1, int num2) {
        int value1 = num1 + num2;
        System.out.println("Addition will be = "+value1);
    }

    public void sub (int num1, int num2) {
        int value2 = num1 - num2;
        System.out.println("Substraction will be = "+value2);
    }

    public void mul (int num1, int num2) {
        int value3 = num1 * num2;
        System.out.println("Multiplication will be = "+value3);
    }

    public void div (int num1, int num2) {
        int value4 = num1 / num2;
        System.out.println("Division will be = "+value4);
    }

    public void mod (int num1, int num2) {
        int value5 = num1 % num2;
        System.out.println("modulus will be = "+value5);
    }

}


public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;

        Calculator calculator = new Calculator();

        calculator.add(num1,num2);
        calculator.sub(num1,num2);
        calculator.mul(num1,num2);
        calculator.div(num1,num2);
        calculator.mod(num1,num2);

    }
}
