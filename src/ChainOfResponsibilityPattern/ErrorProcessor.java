package ChainOfResponsibilityPattern;

public class ErrorProcessor extends LogProcessor{
    ErrorProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel,String message){
        if(logLevel == ERROR){
            System.out.println("Error: "+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
