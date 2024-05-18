package structural.proxy;

public class ProxyClientCode {

    public void execute() {
        DatabaseServiceProxy proxy = new DatabaseServiceProxy("StudentsTable");
        proxy.query("Subhani");
        proxy.deleteTable("StudentsTable");
    }
}
