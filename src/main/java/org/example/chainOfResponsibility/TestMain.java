package org.example.chainOfResponsibility;

public class TestMain {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "Exception happened");
        logProcessor.log(LogProcessor.DEBUG, "Need to Debug");
        logProcessor.log(LogProcessor.INFO, "Just for Info");
    }
}
