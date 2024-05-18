package structural.adpater;

public class ChromeBrowser implements Browser {
    @Override
    public String search(String input) {
        return "Searching results for:" + input + " in Chrome browser.";
    }
}
