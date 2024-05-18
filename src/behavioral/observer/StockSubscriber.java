package behavioral.observer;

// Subscriber interface.
public interface StockSubscriber {
    void update(String stockName, int stockPrice);
}
