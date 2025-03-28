package structural.proxy;

// Implements Database. It is in 3rd party system.
public class DatabaseService implements Database {

    private final String tableName;

    public DatabaseService(String tableName) {
        this.tableName = tableName;
    }

    public void query(String queryExpression) {
        System.out.println("Querying table with attribute name with value: " + queryExpression);
    }

    public void deleteTable(String tableName) {
        System.out.println("Deleted the table.");
    }
}
