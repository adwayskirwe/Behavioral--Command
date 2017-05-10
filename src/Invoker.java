
public class Invoker {
    Command currCommand;
    public void setCommand(Command s){
        currCommand=s;
    }

    public void process(){
        currCommand.execute();
    }
}
