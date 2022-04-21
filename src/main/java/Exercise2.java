import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args){

        //Write a Java program that prompts the user to enter a string and counts the number of uppercase letters.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String sentence = scanner.nextLine();
        int upperCaseCount = 0;

        for (int k = 0; k < sentence.length(); k++) {

            if (Character.isUpperCase(sentence.charAt(k))) {

                upperCaseCount++;
            }
        }
        System.out.println("You used " + upperCaseCount + "upper case letter.\n");
    }
}
