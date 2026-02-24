public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}//Abstract class 1
abstract class LibraryItem{
    private String title;

    public LibraryItem(String title){
        this.title=title;
    }
    public string getTitle (){return title;}
    public abstract void displayInfo();
}
//Abstract class2
abstract class Person {
    protected String name;

    public Person (String name){
        this.name=name;
    }
    public String getName(){return name;}
    public abstract void showDetails();
}

    
    
    

