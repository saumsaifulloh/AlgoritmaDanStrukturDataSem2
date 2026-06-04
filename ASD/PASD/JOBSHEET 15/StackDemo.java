import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        book b1 = new book("978001", "Java");
        book b2 = new book("978002", "Python");
        book b3 = new book("978003", "C++");

        Stack<book> books = new Stack<>();

        books.push(b1);
        books.push(b2);
        books.push(b3);

        System.out.println("Top : " + books.peek());

        book temp = books.pop();

        if (temp != null) {
            System.out.println("Diambil : " + temp);
        }

        System.out.println("\nIsi Stack:");

        for (book b : books) {
            System.out.println(b);
        }

        System.out.println("\nPosisi Java dari puncak stack : " + books.search(b1));

        System.out.println("\nData Stack:");
        System.out.println(books);
    }
}