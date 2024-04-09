package org.example.singleton;

public class DBConnectionLazy {
    private static DBConnectionLazy dbConnectionLazy;

    private DBConnectionLazy(){

    }

    public static DBConnectionLazy getInstance(){
        if(dbConnectionLazy == null){
            dbConnectionLazy = new DBConnectionLazy();
        }
        return dbConnectionLazy;
    }
}
