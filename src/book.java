public class book {
    private String title;

    public book(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return "book: " + title;
    }
}