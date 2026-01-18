package ChainOfResponsibilityPattern;

public class DebugProcessor extends LogProcessor {

    DebugProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel,String message){
        if(logLevel == DEBUG){
            System.out.println("DEBUG: "+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
