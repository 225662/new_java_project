//Concrete class 1
class book {
        private String Author;

        public book (String title, String author){
            this.Author=author;
        }

      public void displayInfo (){
            System.out.println("Book:");
      } 

      public void borrowItem (){
        System.out.println("borrowed");
      }
      
      public void returnItem (){
        System.out.println("returned");
      }
      
    }
