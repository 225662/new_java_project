public class Concrete {
    //Concrete class 1
    class book extends LibraryItem Implements Borrowable{
        private String Author;

        Public Book (String title,Sting authoor){
            super (title);
            this.author=author;
        }
     @Override
      public void displayInfo ();  
      Ststem.out.println("Book:"+getTiltle+"by"+author)
    }
      @Override
      public void borrowItem ();  
      Ststem.out.println(getTiltle+"borrowed");
}
     @Override
      public void returnItem ();  
      Ststem.out.println(getTiltle+"returned");
}
}

//Concrete class 2
class Member extends Person implements Payable{
    private int memberID;

    public member (String name,int memberID){
        super (name);
        this.memberID;
    }
    @Override
    public void showDetails(){
        System.out.println("Member:"+getName+",ID:"+memberID);
    }
    @Override
    public double calculateFee(){
        return 10.0;
    }
    }
//Concerete class 3
class Librarian extends Person{
    public Librarian (String name)  {
        super (name);
    }
    @Override
    public void shoeDetails(){
        System.out.println("Librarian:"+ getName));
    }
    public void manageLibrary(){
        System.out.println( getName()+"manages the library");
    }
}




