import java.util.Arrays;

public class arrayPractice {

    public static void main(String[] args) {
        int num[] = {1, 1, 2, 3, 5, 8};


        for(int i =0; i < num.length; i+=2){
            System.out.println(num[i]);
        }

        String zues = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

//splitting array and using for loop to print each word
        String[] zuesArray = zues.split(" ");
        for (int j = 0; j <zuesArray.length; j++) {
            System.out.println(zuesArray[j]);
        }

        System.out.println(Arrays.toString(zuesArray));

        String[] zuesSentencesArray = zues.split("\\.");
        for (int k = 0; k <zuesSentencesArray.length; k++){
            System.out.println(zuesSentencesArray[k]);
            //System.out.println(Arrays.toString(zuesSentencesArray));
        }
        //System.out.println(zuesSentencesArray[0]);


    }
}
