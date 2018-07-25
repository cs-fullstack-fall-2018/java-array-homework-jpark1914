import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise29 {

    public static void main(String [] args){
        ArrayList<String> squad = new ArrayList<String>();
        squad.addAll(Arrays.asList("Bob", "John", "Kenn", "kevin", "Erin"));
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Which person do you want to see?");
        int userInput = scanIn.nextInt();
        System.out.println(returnInput(squad, userInput));
    }
    public static String returnInput(ArrayList<String> squad2, int userInput){
        return squad2.get(userInput);

    }
}
