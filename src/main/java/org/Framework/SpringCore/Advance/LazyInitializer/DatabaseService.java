package org.Framework.SpringCore.Advance.LazyInitializer;

public class DatabaseService {
    public DatabaseService() {
        System.out.println("DatabaseService initialized");
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }
}