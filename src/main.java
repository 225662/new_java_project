
import java.util.Scanner;

public class main {
    static Scanner scanner= new Scanner(System.in);
public static void main (String[] args){
    
    try{
        

        System.out.print("Enter the name of the book ");
        String bookTitle = scanner.nextLine();

        System.out.print("Enter the name of the author ");
        String author = scanner.nextLine();

        System.out.print("Enter the name of the student ");
        String memberName = scanner.nextLine();

        System.out.print("Enter the member number ");
        int memberNumber = scanner.nextInt();

    }catch (NumberFormatException e){
        System.out.println("invalid studentId");
    }catch (Exception e){
        System.out.println("unexpected error:e.getmessage()");
    }finally{
        scanner.close();
        System.out.println("System is complete");
    }
}
}