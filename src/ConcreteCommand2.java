
public class ConcreteCommand2 implements Command{
    Book book;
    Student stud;
    public ConcreteCommand2(Book b,Student s){
        book=b;
        stud=s;
    }

    public void execute(){
        book.insertBook();
        stud.insertEntry();
    }

}
