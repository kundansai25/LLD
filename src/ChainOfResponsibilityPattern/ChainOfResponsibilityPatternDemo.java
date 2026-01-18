package ChainOfResponsibilityPattern;

public class ChainOfResponsibilityPatternDemo {
    public static void main(String[] args){
        LogProcessor logObj = new InfoLogProcessor(new DebugProcessor(new ErrorProcessor(null)));
        logObj.log(LogProcessor.ERROR,"exception happens");
        logObj.log(LogProcessor.DEBUG,"debugging happening");
        logObj.log(LogProcessor.INFO,"checking info logs");
    }
}
