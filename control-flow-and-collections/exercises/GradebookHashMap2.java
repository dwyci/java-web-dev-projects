import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashMap2 {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newID;
        String idInput = "";

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("ID: ");
             idInput = input.nextLine();

            if (!idInput.equals("")) {
                newID = Integer.parseInt(idInput);
                System.out.print("Name: ");
                String newName = input.nextLine();
                students.put(newID, newName);
            }
        } while (!idInput.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}




