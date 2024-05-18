package behavioral.templatemethod;

public class ClientCodeTemplateMethodPattern {

    public void execute() {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process();

        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.process();
    }
}
