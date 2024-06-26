package org.example.chainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(LogLevel logLevel, String msg){
        if(logLevel == LogLevel.ERROR){
            System.out.println("ERROR: "+msg);
        }else {
            super.log(logLevel, msg);
        }
    }
}
