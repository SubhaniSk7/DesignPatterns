package structural.composite;

// This is a Leaf in tree like structure.
public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File:" + name);
    }
}
