
import java.util.Scanner;
import java.lang.String;

public class Main {


    public static void main(String[] args) {
        System.out.println("»Введите выражение«");
        Scanner scn = new Scanner(System.in);
        String userInput = scn.nextLine();
        String[] Array = UtilsSplit.splitString(userInput);
        char operation = Array[1].charAt(0);
        String result;

        if (Array[1].equals("-") || Array[1].equals("+")) {
            if (Array[0].length() >= 11 || Array[2].length() >= 11) {
                throw new IllegalArgumentException("Ввод строки более 10 символов");
            }
            String st00 = Array[0];
            String st02 = Array[2];
            String ellipsis = "...";
            result = MathOpSumMin.calculated(st00, operation, st02);
            if (result.length() >= 40) {
                System.out.println(result.substring(40) + ellipsis);
            } else {
                result = MathOpSumMin.calculated(st00, operation, st02);
                System.out.println(result);
            }

        } else {

            String st00 = Array[0];
            String st02 = Array[2];
            String ellipsis = "...";
            int number = Integer.parseInt(st02);
            result = MathOpDivMul.calculated(st00, operation, number);
            if (result.length() >= 40) {
                System.out.println(result.substring(40) + ellipsis);
            } else {
                result = MathOpDivMul.calculated(st00, operation, Integer.parseInt(st02));
                System.out.println(result);
            }
        }
    }
}