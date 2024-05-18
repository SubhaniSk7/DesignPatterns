package structural.flyweight;

public class TreeType {
    private final String name; // Intrinsic attribute
    private final String color;// Intrinsic attribute
    private final String texture;// Intrinsic attribute

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    // Extrinsic attributes are passed as parameters
    public void draw(int x, int y) {
        System.out.println("Drawing Tree name:" + name + " color:" + color + " texture:" + texture + " at position x:" + x + " y:" + y);
    }
}
