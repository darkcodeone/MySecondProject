package Operations;

public class Div {
    public static String calculate(String num1, int num2){
        int result = num1.length() / num2;
        return num1.substring(0 , result);
    }

}
