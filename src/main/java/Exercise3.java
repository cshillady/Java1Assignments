import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    public static void main(String[] args){

        //Write a Java program that prompts the user to enter a string and capitalizes every other word, starting with the first word.
        //HINT: The StringTokenizer object or String.split() method might be useful.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String sentence = scanner.nextLine();

        System.out.println(capitalizeEveryOtherWord(sentence));
    }
    public static String capitalizeEveryOtherWord(String sentence) {

        StringBuilder updatedSentence = new StringBuilder(sentence);
        Matcher matcher = Pattern.compile("^ *\\w|\\w* \\w+ \\w").matcher(sentence);

        while(matcher.find()) {
            updatedSentence.setCharAt(matcher.end() - 1, Character.toUpperCase(sentence.charAt(matcher.end() - 1)));
        }
        return updatedSentence.toString();
    }
}//this is a test sentence that should be altered so that every other word is capitalized