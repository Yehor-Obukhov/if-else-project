package Part2PlainConversation;
import java.util.Scanner;

public class plainconversation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello what is your name? ");
        String name = scanner.nextLine();

        System.out.println("Nice to meet you " + name + ", how old are you?");
        int age = scanner.nextInt();

        System.out.println("Thanks you " + name + "!");

        if (age < 6) {
            System.out.println("At your age your daily ativity is usually home, " + "walking and kingergarten");
        } else if (age >= 7 && age <= 17) {
            System.out.println("You probably go to school");
        } else if (age >= 18 && age <= 24) {
            System.out.println("You probably go to college or university");
        } else if (age > 24 && age < 60) {
            System.out.println("You probably go to work");
        } else if (age > 60) {
            System.out.println("You are in retirement age");
        }
        System.out.println("Have a great day " + name + "!");




    }
}
