package behavioral.observer;

public class ClientCodeObserverPattern {

    public void execute() {
        
        StockMarket stockMarketPublisher = new StockMarket();

        StockSubscriber zerodha = new Zerodha();
        StockSubscriber upstox = new Upstox();

        stockMarketPublisher.addSubscriber(zerodha);
        stockMarketPublisher.addSubscriber(upstox);

        stockMarketPublisher.setStockPrice("Tesla", 1000);

        stockMarketPublisher.setStockPrice("Tesla", 1500);
    }
}
