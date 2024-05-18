package structural.decorator.example2;

public class FileDataSource implements DataSource {
    String fileName;
    String data;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        this.data = data;
    }

    @Override
    public String readData() {
        return data;
    }
}
