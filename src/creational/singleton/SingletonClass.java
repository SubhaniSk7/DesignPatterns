package creational.singleton;

public class SingletonClass {
    // for normal/lazy/synchronized initialization
//    public static SingletonClass instance;

    // For Threadsafe(Double checking 2p locking)  initialization
    // used volatile keyword to prevent Cache incoherence issues i.e., making instance immediately visible to other threads.
    // this prevents returning stale instances to other threads.
    public static volatile SingletonClass instance;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        // Lazy initialization
//        if (instance == null) {
//            instance = new SingletonClass();
//        }

        // Double checking(2p) locking: thread safe initialization.
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }

        return instance;
    }

    public void print() {
        System.out.println("This is Singleton pattern.");
    }
}
