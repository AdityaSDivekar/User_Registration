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
    }
}
