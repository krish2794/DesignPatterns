package org.example.chainOfResponsibility;

public class TestMain {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogLevel.ERROR, "Exception happened");
        logProcessor.log(LogLevel.DEBUG, "Need to Debug");
        logProcessor.log(LogLevel.INFO, "Just for Info");
    }
}
