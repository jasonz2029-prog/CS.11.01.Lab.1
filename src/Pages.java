import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        Scanner ageInput = new Scanner(System.in);  //Declare Scanner
        IO.print("Enter your age: ");               //Ask for input
        String age = ageInput.nextLine();           //Collect input in variable "age"
        IO.println(age + "-year olds should read at least " + (100 - Integer.parseInt(age)) + " pages before giving up on a book.");

    }
}
