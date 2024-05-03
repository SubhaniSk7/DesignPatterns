package creational.objectpool;

public class DBConnection {
    public int id;

    public DBConnection(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print() {
        System.out.println("Connection id: " + id);
    }

    public void close() {
        System.out.println("released connection:" + this.id);
    }
}
