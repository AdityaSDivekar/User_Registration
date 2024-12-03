import java.util.regex.*;

public class Main {

    public static boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(firstName);

        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validateFirstName("John"));
        System.out.println(validateFirstName("jo"));
        System.out.println(validateFirstName("Mary"));
        System.out.println(validateFirstName("mike"));
    }
}
