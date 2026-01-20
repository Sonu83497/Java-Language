import java.util.Scanner;
public class getvalue{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            int i = 0;
            while(i<5){
                int inp = input.nextInt();
                System.out.println("Enter a number : " + inp);
                i++;
            }
        }
    }
    
}