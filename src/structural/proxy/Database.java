package structural.proxy;

public interface Database {
    void query(String queryExpression);

    void deleteTable(String tableName);
}
