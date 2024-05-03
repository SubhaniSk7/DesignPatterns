package creational.prototype;

// It can be an interface or an abstract class, but subclass must implement clone method.
// This class is called Prototype.
// We can register prototypes at global level in an application.
public abstract class College {
    public int id;
    public int rank;

    public College() {
    }

    public College(College college) {
        this();
        this.id = college.id;
        this.rank = college.rank;
    }

    abstract College cloneObject();
}
