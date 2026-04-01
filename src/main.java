import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // --- COLLECTIONS ---
        ArrayList<Book> books = new ArrayList<>();
        book.add(new book("Things Fall Apart"));
        book.add(new book("Programming bgook"));
        book.add(new book("Rich Dad Poor Dad"));

        System.out.println("Books in system:");
        for (book b : book) {
            System.out.println(b);
        }

        //  SAVE TO FILE 
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("books.txt"));
            for (book b : book) {
                writer.write(b.getTitle());
                writer.newLine();
            }
            writer.close();
            System.out.println("Books saved to books.txt");
        } catch (IOException e) {
            System.out.println("Error saving: " + e.getMessage());
        }

        //  READ FROM FILE 
        System.out.println("Reading from file:");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("books.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        }
    }
}


