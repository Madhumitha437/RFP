package day23;
@FunctionalInterface
interface Validator {
    boolean validate(String input);
}
public class UserValidationLambda {

    public static void main(String[] args) {

        // ✅ First Name: Starts with capital letter, min 3 chars
        Validator firstName = (name) -> name.matches("^[A-Z][a-zA-Z]{2,}$");

        // ✅ Last Name: Same rule as first name
        Validator lastName = (name) -> name.matches("^[A-Z][a-zA-Z]{2,}$");

        // ✅ Email validation
        Validator email = (mail) ->
                mail.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");

        // ✅ Mobile number: country code + space + 10 digits
        Validator mobile = (mob) ->
                mob.matches("^[0-9]{1,3}\\s[0-9]{10}$");

        // ✅ Password: Minimum 8 chars, at least 1 uppercase, 1 digit, 1 special char
        Validator password = (pwd) ->
                pwd.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$");


        // 🔹 Testing inputs
        System.out.println("First Name valid: " + firstName.validate("Madhu"));
        System.out.println("Last Name valid: " + lastName.validate("Mitha"));
        System.out.println("Email valid: " + email.validate("madhu@gmail.com"));
        System.out.println("Mobile valid: " + mobile.validate("91 9876543210"));
        System.out.println("Password valid: " + password.validate("Abc@1234"));
    }
}