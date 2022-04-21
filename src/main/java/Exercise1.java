import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args){

        //Write a Java program that prompts the user to enter their name, and returns their name in upper case.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String sentence = scanner.nextLine();
        System.out.println("Your name in upper case is: " + sentence.toUpperCase() + "\n");
    }
}