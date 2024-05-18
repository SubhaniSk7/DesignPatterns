package structural.adpater;

public class AdapterClientCode {
    public void execute() {
        Browser chrome = new ChromeBrowser();
        Internet internet = new Internet(chrome);
        internet.searchInternet("Subhani");

        BraveBrowser braveBrowser = new BraveBrowser();
        BraveBrowserAdapter browserAdapter = new BraveBrowserAdapter(braveBrowser);
        internet = new Internet(browserAdapter);
        internet.searchInternet("Subhani");
    }
}
