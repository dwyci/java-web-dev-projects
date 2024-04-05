import java.util.ArrayList;
import java.util.Scanner;

public class WordLength {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What length of word size would you like to capture?  ");

        int wordSize = input.nextInt();

        String molaleniQuote = "I followed the step under EXERCISES: CONTROL" +
                " FLOW AND COLLECTIONS so that I can some Array Practice. But " +
                "I don't see the green play button even after I created my main " +
                "starting point.";

        ArrayList<String> fiveLetterWords = new ArrayList<>();

        String[]molaleniQuoteArray = molaleniQuote.split(" ");
        for (int j=0; j<molaleniQuoteArray.length; j++) {
            if (molaleniQuoteArray[j].length() == wordSize) {
                fiveLetterWords.add(molaleniQuoteArray[j]);
            }

        }
        System.out.println(fiveLetterWords);


        }
}