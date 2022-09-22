public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(LogProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == INFO) {
            System.out.println("INFO: " +message);
        } else {
            super.log(logLevel, message);
        }
    }
}
