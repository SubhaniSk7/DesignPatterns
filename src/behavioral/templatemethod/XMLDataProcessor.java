package behavioral.templatemethod;

public class XMLDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading data from XML file.");
    }

    @Override
    protected void processData() {
        System.out.println("Processed XML data.");
    }

    @Override
    protected void writeData() {
        System.out.println("Writing data to XML file.");
    }
}
