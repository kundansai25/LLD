package ChainOfResponsibilityPattern;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nexLoggerProcessor;

    LogProcessor(LogProcessor logProcessor){
        this.nexLoggerProcessor = logProcessor;
    }

    public void log(int logLevel,String messgae){
        if(nexLoggerProcessor != null){
            nexLoggerProcessor.log(logLevel,messgae);
        }
    }

}
