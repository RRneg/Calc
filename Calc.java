package ua.com.calc;

import ua.com.calc.calcmath.CalcMath;
import ua.com.calc.iocalc.IoCalc;
import ua.com.calc.util.Steps;

import java.io.IOException;

public class Calc {

    public static void main(String[] args) throws IOException {
        int typeOperation;
        double num1;
        double num2;
        double result;
        double stopFlag = 1;

        System.out.println("Press ESC to exit, any key to continue");

        while (stopFlag != 0) {

            typeOperation = (int) Steps.choiceOperation();
            num1 = Steps.firstNumber(typeOperation);
            num2 = Steps.secondNumber(typeOperation);

            CalcMath calcMath = new CalcMath();
            result = calcMath.calcMath(num1, num2, typeOperation);
            IoCalc.output(result);

            System.out.println("Press 0 to exit");
            stopFlag = IoCalc.operationScaner();

        }
    }
}

