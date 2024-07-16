import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidator {
    private static final String PASSWORD_REGEX =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&_+\\-=]).{8,}$";

    public static boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String password = "Example@123";
        System.out.println("Is valid password: " + isValidPassword(password));
    }
}
