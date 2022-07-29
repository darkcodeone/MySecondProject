import java.util.ArrayList;
import java.util.Objects;

public class UtilsSplit {

    public static final String STRING_IS_NOT_IN_RIGHT_FORMAT = "String is not in right format!";

    private UtilsSplit() {
    }

    public static String[] splitString(String inputString) {
        if (Objects.isNull(inputString) || !inputString.startsWith("\"")) {
            throw new IllegalArgumentException(STRING_IS_NOT_IN_RIGHT_FORMAT);
        }

        String[] splittedString = inputString.split("\\s+(?=[^\"]*(?:\"[^\"]*\"[^\"]*)*$)");
        splittedString[0] = splittedString[0].replaceAll("\"", "");
        splittedString[2] = splittedString[2].replaceAll("\"", "");

        if (inputString.charAt(splittedString[0].length() + 1) != '\"') {
            throw new IllegalArgumentException(STRING_IS_NOT_IN_RIGHT_FORMAT);
        }

        if (inputString.chars().filter(ch -> ch == '"').count() == 4 && splittedString[2].chars().allMatch(Character::isDigit))
            if (splittedString[1].equals("/") || splittedString[1].equals("*")) {
                throw new IllegalArgumentException(STRING_IS_NOT_IN_RIGHT_FORMAT);
            }

        if (inputString.chars().filter(ch -> ch == '"').count() != 4 || splittedString[0].endsWith("\""))
            if (splittedString[1].equals("+") || splittedString[1].equals("-")) {
                throw new IllegalArgumentException(STRING_IS_NOT_IN_RIGHT_FORMAT);
            }
        return splittedString;
    }
}