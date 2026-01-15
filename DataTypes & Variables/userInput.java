
import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            

                System.out.print("Enter your name :");
                String name = input.nextLine();
                System.out.println("Good Morning, " + name + ".");

                System.out.print("Enter Your Age :");
                int age = input.nextInt();
                System.out.println("You are" + age + "Years old.");

                input.close(); //resource leak fix
            }
        }
    }
