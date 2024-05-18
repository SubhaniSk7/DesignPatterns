package behavioral.templatemethod;

// Abstract class
public abstract class DataProcessor {

    // Template method. All subclasses need to follow same steps. Subclasses can override individual steps.
    // Restricting subclasses to override template method, so marking it as final.
    public final void process() {
        readData();
        processData();
        writeData();
        displayData();
    }

    protected abstract void readData();

    protected abstract void processData();

    protected abstract void writeData();

    public void displayData() {
        System.out.println("Common display: Data processed.");
    }
}
