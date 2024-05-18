package behavioral.observer;

// Concrete Subscriber(Listener), which just get updated information from publisher and does respective work.
public class Upstox implements StockSubscriber {

    // The fields can be according to respective subscriber.
    String stockName;
    int stockPrice;

    @Override
    public void update(String stockName, int stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        display();
    }

    public void display() {
        System.out.println("Upstox - stockName: " + stockName + " stockPrice:" + stockPrice);
    }
}
