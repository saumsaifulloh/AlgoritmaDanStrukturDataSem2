import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Mangga");
        fruits.add("Jeruk");
        fruits.add("Apel");
        fruits.add("Pisang");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("First : " + fruits.first());
        System.out.println("Last : " + fruits.last());

        fruits.remove("Jeruk");

        System.out.println("Poll First : " + fruits.pollFirst());
        System.out.println("Poll Last : " + fruits.pollLast());
    }
} 
    
