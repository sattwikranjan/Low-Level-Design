package ChainOfResponsibility.Logger;

public class Main{
    public static void main(String[] args){
        LogProcessor logObject=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(1,"This is a INFO Logger");
        logObject.log(2,"This is a DEBUG Logger");
        logObject.log(3,"This is a ERROR Logger");
    }
}