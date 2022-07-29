import Operations.Div;
import Operations.Mul;

public class MathOpDivMul {
    public static String calculated(String num1, char op, int num2) {

        if (num2 >= 11){
            throw new IllegalArgumentException("Ввод числа превышает допустимое значение");
        }

        switch (op) {

            case '/' -> {
                return Div.calculate(num1, num2);
            }
            case '*' -> {
                return Mul.calculate(num2, num1);
            }

            default -> throw new IllegalArgumentException("Неверный знак операции! Используйте \"*\" or \"/\"");
        }

    }
}
