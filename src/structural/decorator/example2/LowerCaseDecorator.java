package structural.decorator.example2;

public class LowerCaseDecorator extends DataSourceDecorator {
    public LowerCaseDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data);
    }

    @Override
    public String readData() {
        return super.readData().toLowerCase();
    }
}
