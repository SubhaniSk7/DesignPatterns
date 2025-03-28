package structural.adpater;

// Our browser which we are using in our system
public class ChromeBrowser implements Browser {
    @Override
    public String search(String input) {
        return "Searching results for:" + input + " in Chrome browser.";
    }
}
