package behavioral.observer;

import java.util.ArrayList;

// Concrete publisher. We can implement as many publishers as required which implements Publisher interface.
public class StockMarket extends Publisher {

    // It can map as well Map<String, List<Subscribers>> where key is eventType.
    // For each eventType there can be list of subscribers.
    ArrayList<StockSubscriber> subscribers = new ArrayList<>();

    // It can be Map of stocks with respective prices.
    String stockName;
    int stockPrice;

    public void setStockPrice(String stockName, int stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;

        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        for (StockSubscriber subscriber : subscribers) {
            subscriber.update(stockName, stockPrice);
        }
    }

    @Override
    public void addSubscriber(StockSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(StockSubscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
