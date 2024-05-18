package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightClientCode {

    public void execute() {
        List<Tree> forest = new ArrayList<>();

        for (int i = 0; i < 5; ++i) {
            TreeType treeType = TreeFactory.getTreeType("Apple", "Green", "Rough");

            Tree tree = new Tree(getRandomX(), getRandomY(), treeType);
            forest.add(tree);
        }

        for (Tree tree : forest) {
            tree.draw();
        }
    }

    public int getRandomX() {
        return (int) (Math.random() * 1000);
    }

    public int getRandomY() {
        return (int) (Math.random() * 1000);
    }
}
