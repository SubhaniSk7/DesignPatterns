package structural.proxy;

public class DatabaseServiceProxy implements Database {

    private final DatabaseService databaseService;

    public DatabaseServiceProxy(String tableName) {
        this.databaseService = new DatabaseService(tableName);
    }

    @Override
    public void query(String queryExpression) {
        databaseService.query(queryExpression);
    }

    @Override
    public void deleteTable(String tableName) {
        System.out.println("backing up the data before deleting.");
        databaseService.deleteTable(tableName);
    }
}
