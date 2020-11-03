package ua.com.calc.util;

import ua.com.calc.iocalc.IoCalc;

import java.io.IOException;

public class Steps {

    public static double choiceOperation() {
        double typeOperation = 0;
        System.out.println("select operation\n" +
                "1.addition\n" +
                "2.subtraction\n" +
                "3.multiplication\n" +
                "4.division\n" +
                "5.raising a number to an integer power\n" +
                "6.square root\n" +
                "7.sine\n" +
                "8.cosine\n" +
                "9.tangent\n" +
                "10.catangent");


        typeOperation = IoCalc.operationScaner();
        while (typeOperation < 1 || typeOperation > 10) {
            System.out.println("Select wrong, repeat");
            typeOperation = IoCalc.operationScaner();
        }
        return typeOperation;
    }

    public static double firstNumber(int typeOperation) throws IOException {
        double num1 = 0;
        System.out.println("Enter the first number");
        num1 = IoCalc.operationScaner();
        if (typeOperation == 6 && num1 < 0) {
            System.out.println("You cannot do such an operation in Euclidean space. Try again");
            num1 = firstNumber(typeOperation);
        }
        return num1;
    }

    public static double secondNumber(int typeOperation) {
        double num2 = 0;

        if (typeOperation > 5) {
            num2 = 0;
        } else {
            System.out.println("Enter the second number");
            num2 = IoCalc.operationScaner();

        }
        if (typeOperation == 5 && num2 % 1 != 0 || num2 < 0) {
            System.out.println("The power of the number must be positive and integer");
            num2 = secondNumber(typeOperation);
        }
        if (typeOperation == 4 && num2 == 0) {
            System.out.println("Divisor cannot be zero");
            num2 = secondNumber(typeOperation);
        }


        return num2;
    }


}


