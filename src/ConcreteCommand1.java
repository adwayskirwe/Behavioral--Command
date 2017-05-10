
public class ConcreteCommand1 implements Command {
    Book book;
    public ConcreteCommand1(Book b){
        book=b;
    }
    public void execute(){
        book.searchBook();
    }
}
