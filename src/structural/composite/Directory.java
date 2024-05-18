package structural.composite;

import java.util.ArrayList;

// This is a Composite component. It may contain another composite component or leaf.
// Another example: Order Box with product. Box can caontain another box.
public class Directory implements FileSystemComponent {
    private final String name;
    private final ArrayList<FileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Directory:" + name);
        for (FileSystemComponent component : components) {
            component.display();
        }
    }
}
