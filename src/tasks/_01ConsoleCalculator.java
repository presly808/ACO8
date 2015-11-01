package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _01ConsoleCalculator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int exitCode = 2;
        String operandsContainer = "{+,-,*,/}";

        System.out.println("Start Program");

        int choose = 0;

        while(choose != exitCode){

            showMenu();
            System.out.println("input choose");
            choose = inputChoose(sc);

            if(choose == 1){
                System.out.println("Input one operator from next list " + operandsContainer);
                char operator = inputOperator(sc);

                if(!isValidOperator(operandsContainer, operator)){
                    System.out.println("Wrong operator");
                    System.out.println("Was choosed default operator +");
                    operator = '+';
                }

                System.out.println("Input operands with next syntax ex. [33,12,54,23,67]");
                double[] operands = inputOperands(sc);

                double res = evaluateOperationOverOperands(operands, operator);

                System.out.println("*************************");
                System.out.println("RESULT");
                System.out.println(formatResult(operator,operands,res));
                System.out.println("*************************");
                System.out.println();


            }
        }


    }

    public static String formatResult(char operator, double[] operands, double operationResult){
        return Arrays.toString(operands).replace(',',operator) + " = " + operationResult;
    }

    public static boolean isValidOperator(String operators, char inputOperator){
        return operators.contains(String.valueOf(inputOperator));
    }

    public static int inputChoose(Scanner scanner){
        String input = scanner.nextLine().trim();
        return Integer.parseInt(input);
    }

    public static char inputOperator(Scanner scanner){
        String input = scanner.nextLine().trim();
        return input.trim().charAt(0);
    }

    // input like [21,354,56,34]  - SEPARATED BY COMMA
    public static double[] inputOperands(Scanner scanner){
        String operatorsStr = scanner.nextLine();

        int openBraceIndex = operatorsStr.indexOf("[");
        int closeBraceIndex = operatorsStr.lastIndexOf("]");

        String withoutBraces = operatorsStr.substring(openBraceIndex + 1, closeBraceIndex);

        String[] separatedOperators = withoutBraces.split(",");

        return convert(separatedOperators);
    }

    public static double[] convert(String[] operators){
        double[] res = new double[operators.length];

        for (int i = 0; i < res.length; i++) {
            res[i] = Double.parseDouble(operators[i]);
        }

        return res;
    }

    public static double evaluateOperationOverOperands(double[] mas, char operand){

        double amountRes = mas[0];

        for (int i = 1; i < mas.length; i++) {
            amountRes = doOperation(amountRes, mas[i], operand);
        }

        return amountRes;
    }

    public static double doOperation(double d1, double d2, char operand){
        double res = 0;

        switch (operand) {
            case '+' :
                res = d1 + d2;
                break;
            case '-' :
                res = d1 - d2;
                break;
            case '*' :
                res = d1 * d2;
                break;
            case '/' :
                res = d1 / d2;
                break;
            default:
                System.out.println("wrong input operand");
                break;
        }

        return res;
    }

    public static void showMenu(){
        System.out.println("1.Do operation");
        System.out.println("2.Exit");
        System.out.println();
    }


}
