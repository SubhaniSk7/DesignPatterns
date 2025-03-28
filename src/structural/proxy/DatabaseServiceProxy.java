package structural.proxy;

// This is in our system. Creating proxy for 3rd party Database system.
public class DatabaseServiceProxy implements Database {

    private final Database database;

    public DatabaseServiceProxy(String tableName) {
        this.database = new DatabaseService(tableName); // this concrete implementation can be passed as argument.
    }

    @Override
    public void query(String queryExpression) {
        // we can have extra work like logs etc.
        database.query(queryExpression);
        // we can have extra work like logs etc.
    }

    @Override
    public void deleteTable(String tableName) {
        // we can have extra work like logs, backing up etc.
        System.out.println("backing up the data before deleting.");
        database.deleteTable(tableName);
        // we can have extra work like logs, backing up etc.
    }
}
