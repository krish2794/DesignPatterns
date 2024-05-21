package org.example.chainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(LogLevel logLevel, String msg){
        if(logLevel == LogLevel.DEBUG){
            System.out.println("DEBUG: "+msg);
        }else {
            super.log(logLevel, msg);
        }
    }
}
