package ua.com.calc.calcmath;

import static java.lang.Math.*;

public class CalcMath {

    public double calcMath(double num1, double num2, int codeOperation) {
        double result = 0;
        switch (codeOperation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = pow(num1, num2);
                break;
            case 6:
                result = sqrt(num1);
                break;
            case 7:
                result = sin(num1 * 0.0174533);
                break;
            case 8:
                result = cos(num1 * 0.0174533);
                break;
            case 9:
                result = tan(num1 * 0.0174533);
                break;
            case 10:
                result = 1 / tan(num1 * 0.0174533);
                break;
        }
        return result;
    }

}
