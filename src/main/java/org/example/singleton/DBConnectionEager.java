package org.example.singleton;

public class DBConnectionEager {
    private static final DBConnectionEager dbConnectionEager = new DBConnectionEager();

    private DBConnectionEager(){

    }

    public static DBConnectionEager getInstance(){
        return dbConnectionEager;
    }
}
