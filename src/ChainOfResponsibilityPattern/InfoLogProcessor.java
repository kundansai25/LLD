package ChainOfResponsibilityPattern;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel,String messgae){
        if(logLevel == INFO){
            System.out.println("INFO: "+messgae);
        }
        else{
            super.log(logLevel,messgae);
        }
    }
}
