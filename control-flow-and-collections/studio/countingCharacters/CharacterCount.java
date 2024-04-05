package countingCharacters;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String quote  = "f the product of two terms is zero then common " +
                "sense says at least one of the two terms has to be zero to" +
                " start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing" +
                " that side of the equation to equal zero. Once you’ve done that," +
                " it’s pretty straightforward from there.";

        //convert the string to an array
        char[] charArray = quote.toCharArray();

        //hashmapto store character and their counts
        HashMap<Character,Integer> counts = new HashMap<>();

        //Loop through each character in the array
        for(char letter:  charArray){
            //IF the character is already in the map, increment its count
            if(counts.containsKey(letter)){
                counts.put(letter, counts.get(letter) + 1);
            } else {
                //if the character is not in the map, addit with count 1
                //every character in the string is represented in the map even if only appears once
                counts.put(letter,1);
            }
        }
        for (Map.Entry<Character, Integer> count: counts.entrySet()){
            //loop through themap entries and print each character with its count
            System.out.println(count.getKey() + ":" + count.getValue());
        }

    }
}
