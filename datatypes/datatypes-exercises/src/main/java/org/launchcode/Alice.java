package org.launchcode;
import java.util.Scanner;
public class Alice {
    public static void main(String args[]){

        String firstSentence =
                "Alice was beginning to get very tired of sitting by her sister " +
                        "on the bank, and of having nothing to do: once or twice she had peeped " +
                        "into the book her sister was reading, but it had no pictures or conversations " +
                        "in it, ‘and what is the use of a book,’ thought " +
                        "Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search for?  ");
        String word = input.nextLine();



        int indexedWord = firstSentence.indexOf(word);
        int legthOfWord = word.length();

        String lowerCaseFirstSentence = firstSentence.toLowerCase();
        String lowerCaseWord = word.toLowerCase();

        boolean searchTermFound = lowerCaseFirstSentence.contains(lowerCaseWord);

        if(searchTermFound){
            System.out.println("The word " + word + " was found in the sentence");
        } else {
            System.out.println("The word " + word + " was not found in the sentence");
        }

        //Print out its index within the string and its length. Next, remove the
        // word from the string and print the sentence again to confirm your code.

        System.out.println("The index of " + word + " is " +  indexedWord);
        System.out.println("The length of " + word +  " is " + legthOfWord);

        String newSentence = firstSentence.replaceAll("(?i)" + word, ""); // (?i) is for case-insensitive replacement
        System.out.println("Sentence after removing '" + word + "':");
        System.out.println(newSentence);

    }
}
