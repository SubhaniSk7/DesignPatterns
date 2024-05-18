package structural.adpater;

// Adaptee: which is incompatible with existing Browser interface.
public class BraveBrowser {
    public String query(String input) {
        return "Searching results for:" + input + " in Brave browser.";
    }
}
