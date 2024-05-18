package structural.flyweight;

// Flyweight class, it has Intrinsic(shareable, common to many states) data.
// It has Extrinsic methods which have varying data for each state.
public class Tree {
    private final int x;// Extrinsic attribute
    private final int y;// Extrinsic attribute

    private final TreeType treeType; // Intrinsic attribute

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    // This method represents varying data i.e., for each character it varies with fontSize and color.
    public void draw() {
        treeType.draw(x, y);
    }
}
