package org.example.singleton;

public class DBConnectionDoubleLock {
    private static DBConnectionDoubleLock dbConnectionDoubleLock;

    private DBConnectionDoubleLock(){

    }

    public static DBConnectionDoubleLock getInstance(){
        if(dbConnectionDoubleLock == null){
            synchronized (DBConnectionDoubleLock.class){
                if(dbConnectionDoubleLock == null){
                    dbConnectionDoubleLock = new DBConnectionDoubleLock();
                }
            }
        }
        return dbConnectionDoubleLock;
    }
}
