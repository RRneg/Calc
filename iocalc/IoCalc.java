package ua.com.calc.iocalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IoCalc {


    public static double operationScaner() {
        double typeOperation = 0;
        Scanner input = new Scanner(System.in);
        typeOperation = input.nextDouble();
        return typeOperation;
    }


    public static void output(Double result) {
        System.out.println("Result of operation    " + result);
    }


}
