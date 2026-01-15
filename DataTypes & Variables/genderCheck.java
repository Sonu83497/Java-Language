import java.util.Scanner;

public class genderCheck {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Check Gender...\n");
            System.out.print("Please Enter Gender : ");
            String name = input.next();
            
            if (name.equalsIgnoreCase("Male") || name.equalsIgnoreCase("m")) {
                System.out.println("You are a Male. Congratulations!");
            }
            else if (name.equalsIgnoreCase("Female") || name.equalsIgnoreCase("f")) {
                System.out.println("You are a Female. Congratulations!");
            }
            else {
                System.out.println("Invalid gender input!");
            }
        }
    }
}
