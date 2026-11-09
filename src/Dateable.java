import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner ageInput = new Scanner(System.in);  //Declare Scanner
        IO.print("Enter your age: ");               //Ask for input
        String age = ageInput.nextLine();           //Collect input in variable "age"
        IO.println(age + "-olds should date somebody who is at least " + (7+ Integer.parseInt(age)/2) + " years old.");

    }
}
