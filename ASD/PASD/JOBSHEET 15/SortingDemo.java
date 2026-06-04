import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {
    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();

        data.add("Mangga");
        data.add("Apel");
        data.add("Jeruk");

        Collections.sort(data);

        System.out.println(data);
    }
}