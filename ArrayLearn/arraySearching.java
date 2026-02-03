import java.util.Scanner;
public class arraySearching {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int[] arr = {3, 6, 8, 87, 65, 4, 68, 23, 9, 98, 34};
            System.out.print("Welcome to Array Searching Program!\n");
            System.out.print("Enter the number to search: ");
            int num = input.nextInt();
            boolean found = isFound(arr, num);
            if(found){
                System.out.println("Number " + num + " is found in the array.");
            } else {
                System.out.println("Number " + num + " is not found in the array.");
            }
        }
    }
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
