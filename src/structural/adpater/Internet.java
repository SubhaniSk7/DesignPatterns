package structural.adpater;

public class Internet {
    Browser browser;

    public Internet(Browser browser) {
        this.browser = browser;
    }

    public void searchInternet(String input) {
        System.out.println(browser.search(input));
    }
}
