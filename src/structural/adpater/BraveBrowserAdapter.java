package structural.adpater;

// Adapter for new browser: Brave
// Adapter implements Browser interface and is composition of BraveBrowser(Adaptee)
public class BraveBrowserAdapter implements Browser {
    BraveBrowser braveBrowser;

    public BraveBrowserAdapter(BraveBrowser braveBrowser) {
        this.braveBrowser = braveBrowser;
    }

    @Override
    public String search(String input) {
        return braveBrowser.query(input);
    }
}
