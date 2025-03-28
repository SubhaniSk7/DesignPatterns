package structural.proxy;

// Some 3rd party code in other system.
public interface Database {
    void query(String queryExpression);

    void deleteTable(String tableName);
}
