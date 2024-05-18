package behavioral.observer;

public abstract class Publisher {
    public abstract void notifySubscribers();

    public abstract void addSubscriber(StockSubscriber subscriber);

    public abstract void removeSubscriber(StockSubscriber subscriber);
}
