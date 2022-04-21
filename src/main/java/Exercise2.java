import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args){

        //Write a Java program that prompts the user to enter a string and counts the number of uppercase letters.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String sentence = scanner.nextLine();
        int upperCaseCount = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (Character.isUpperCase(sentence.charAt(i))) {

                upperCaseCount++;
            }
        }
        System.out.println("You used " + upperCaseCount + "upper case letter.\n");
    }
}
