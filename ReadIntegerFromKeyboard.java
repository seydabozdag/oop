import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadIntegerFromKeyboard {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer value: ");
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch. Please enter a valid integer.");
        }
    }
}
