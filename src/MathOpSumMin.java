import Operations.Min;
import Operations.Sum;

public class MathOpSumMin {
    public static String calculated(String num1, char op, String num2) {

        if (num1.length() >= 11 || num2.length() >= 11){
            throw new IllegalArgumentException("Ввод строки превышает допустимое значение");
        }

        switch (op) {

            case '+' -> {
                return Sum.calculate(num1, num2);
            }
            case '-' -> {
                return Min.calculate(num1, num2);
            }

            default -> throw new IllegalArgumentException("Неверный знак операции! Используйте \"+\" or \"-\"");
        }
    }
}
