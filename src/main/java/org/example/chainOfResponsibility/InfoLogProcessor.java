package org.example.chainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(LogLevel logLevel, String msg){
        if(logLevel == LogLevel.INFO){
            System.out.println("INFO: "+msg);
        }else {
            super.log(logLevel, msg);
        }
    }
}
