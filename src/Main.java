import java.util.Scanner;

public class Main {

    public static boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(regex);
    }
    public static boolean isValidLastName(String lastName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return lastName.matches(regex);
    }

    public static boolean isValidEmail(String email) {
        // Regular Expression for email validation
        String regex = "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$";
        return email.matches(regex);
    }
    public static boolean isValidMobileNumber(String mobileNumber) {
        String regex = "^[0-9]{2} [0-9]{10}$";
        return mobileNumber.matches(regex);
    }

    public static boolean isValidPassword(String password) {
        String regex = "^.{8,}$";

        if (!password.matches(regex)) {
            System.out.println("Password must have at least 8 characters.");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        String firstName = scanner.nextLine();
        if(validateFirstName(firstName)){
            System.out.println("Valid first name");
        }else{
            System.out.println("Invalid First Name.It must start with a capital letter and have atleast 3 characters");
        }
        System.out.print("Enter your Last Name: ");
        String lastName = scanner.nextLine();
        if(isValidLastName(lastName)){
            System.out.println("Valid Last Name.");

        }else{
            System.out.println("Invalid Last Name. It must start with a capital letter and have at least 3 characters.");

        }

        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();
        if (isValidEmail(email)) {
            System.out.println("Valid Email.");
        } else {
            System.out.println("Invalid Email. Ensure it has the correct format (e.g., abc.xyz@bl.co.in).");
        }

        System.out.print("Enter your Mobile Number (e.g., 91 9919819801): ");
        String mobileNumber = scanner.nextLine();

        if (isValidMobileNumber(mobileNumber)) {
            System.out.println("Valid Mobile Number.");
        } else {
            System.out.println("Invalid Mobile Number. Ensure it follows the format: 91 9919819801.");
        }

        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Invalid Password. Ensure all rules are met.");
        }

        scanner.close();

    }
}
