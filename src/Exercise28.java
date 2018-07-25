import java.util.ArrayList;
import java.util.Arrays;

public class Exercise28 {

    public static void main(String[] args) {
        ArrayList<Integer> numQuart = new ArrayList<Integer>();
        numQuart.addAll(Arrays.asList(25 , 50, 100, 200));
        int itemIndex = 2;
        printInteger(numQuart, itemIndex);


    }
    public static int printInteger(ArrayList<Integer> anArray, int itemIndex){

        System.out.println(anArray.get(itemIndex));
        anArray.add(90);
        return  anArray.get(itemIndex);
    }
}
