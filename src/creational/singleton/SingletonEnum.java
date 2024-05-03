package creational.singleton;

// we can implement Singleton pattern using Enum as well which is considered as concise and thread safe.
public enum SingletonEnum {
    INSTANCE;

    public void print() {
        System.out.println("This is Singleton pattern using Enum.");
    }
}
