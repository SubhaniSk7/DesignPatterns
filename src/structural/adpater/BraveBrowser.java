package structural.adpater;

// Adaptee: which is incompatible with existing Browser interface.
// It is 3rd party Browser which is in other system.
public class BraveBrowser {
    public String query(String input) {
        return "Searching results for:" + input + " in Brave browser.";
    }
}
