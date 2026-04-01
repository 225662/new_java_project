
//Concrete class 2
class Member extends Person {
    private int memberID;

    public Member(String name, int age, int memberID){
        super(name, age);
        this.memberID = memberID;
    }
}