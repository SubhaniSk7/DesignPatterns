package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory. It helps in reusing existing flyweight object.
// If flyweight object is not present, we need to create a new flyweight object.
public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "#" + color + "#" + texture;
        TreeType treeType = treeTypes.get(key);
        if (treeType == null) {
            treeType = new TreeType(name, color, texture);
            treeTypes.put(key, treeType);
            System.out.println("created a new treeType:" + key);
        }
        return treeType;
    }
}
