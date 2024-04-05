import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Double> evens = new ArrayList<>();

        for (double i = 0.0; i <=20.0 ; i+=2) {
            evens.add(i);
        }
        System.out.println(sumEven(evens));
    }


    public static int sumEven(ArrayList<Double> arr) {
        int total = 0;
        for (double integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }


}
