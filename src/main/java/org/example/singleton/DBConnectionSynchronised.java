package org.example.singleton;

public class DBConnectionSynchronised {
    private static DBConnectionSynchronised dbConnectionSynchronised;

    private DBConnectionSynchronised(){

    }

    public synchronized static DBConnectionSynchronised getInstance(){
        if(dbConnectionSynchronised == null){
            dbConnectionSynchronised = new DBConnectionSynchronised();
        }
        return dbConnectionSynchronised;
    }
}
