
public class Client {
    public static   void main(String[]args){
        Invoker invoker=new Invoker();
        Student s=new Student();
        Book b=new Book();
        Command obj=new ConcreteCommand1(b);//you have to use these receiver objects bro !
        invoker.setCommand(obj);
        invoker.process();
        obj=new ConcreteCommand2(b,s);
        invoker.setCommand(obj);
        invoker.process();

    }
}
