package structural.decorator.example2;

public class UpperCaseDecorator extends DataSourceDecorator {
    public UpperCaseDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data);
    }

    @Override
    public String readData() {
        return super.readData().toUpperCase();
    }
}
