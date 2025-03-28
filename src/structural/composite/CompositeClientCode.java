package structural.composite;

public class CompositeClientCode {
    public void execute() {

        Directory directory1 = new Directory("Books");
        directory1.add(new File("Analysis of Algorithms.pdf"));

        File file = new File("one.java");
        Directory rootDirectory = new Directory("Work");
        rootDirectory.add(file);
        rootDirectory.add(directory1);

        rootDirectory.display();
    }
}
