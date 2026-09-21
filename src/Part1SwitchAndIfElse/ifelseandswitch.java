package Part1SwitchAndIfElse;
import java.util.Scanner;

public class ifelseandswitch {

    public static void main(String[] args)



    {

        Scanner scanner = new Scanner(System.in);

        // Part 1 Syntax demonstration

        // Part 1.1 if/else

        int number = 10;

        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("The number is negative");
        }

        // Part 1.2 Relational operators

        int a = 10;
        int b = 20;

        if (a == 10) {
            System.out.println("The number equal to 10");
        }
        if (a != b) {
            System.out.println("a is not equal to b");
        }
        if (b > a) {
            System.out.println("a is greater than b");
        }
        if (a < b) {
            System.out.println("a is less than b");
        }
        if (a <= 10) {
            System.out.println("a is less or equals 10");
        }
        if (b >= 20) {
            System.out.println("b is greater or equals 20");
        }

        // Part 1.3 String equals

        String language = "Java";

        if (language.equals("Java")) {
            System.out.println("The selected language is Java");

        } else {
            System.out.println("Another language was selected");
        }

        // Part 1.4 logical operators
        int age = 22;
        boolean hasStudentCard = true;
        // && operator
        if (age >= 18 && hasStudentCard) {
            System.out.println("The person is an adult student");
        }
        // || operator
        if (age < 18 || age > 60) {
            System.out.println("The person is either under 18 or over 60");
        } else {
            System.out.println("The person is between 18 and 60");
        }
        // ! operator
        if (!hasStudentCard) {
            System.out.println("This person does not have a student card");
        } else {
            System.out.println("This person does have a student card");
        }
        //  Part 1.5 conditions with input
        System.out.println("Enter your age: ");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        if (userAge >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are a minor!");
        }
        // Part 1.6 nested if/else conditionals
        if (userAge >= 18) {
            if (userAge >= 60) {
                System.out.println("You are an adult and you are retired");
            } else {
                System.out.println("You are an adult but not retered");
            }
        } else {
            if (userAge >= 13) {
                System.out.println("You are a teenager");
            } else {
                System.out.println("You are a child");
            }
        }

        // Switch
        System.out.println("Select a number from 1 to 3");
        int choice = scanner.nextInt();
        switch (choice) {

            case 1:
                System.out.println("You selected number 1: java");
                break;

            case 2:
                System.out.println("You selected number 2: Python");
                break;

            case 3:
                System.out.println("You selected number 3: javascript");
                break;

            default:
                System.out.println("Unknown optin");
                break;
        }
        scanner.close();
    }
}









