package structuralPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, Tree> cache = new HashMap<>();

    private TreeFactory() {
    }

    public static Tree getInstance(String color) {
        Tree tree = cache.get(color);

        if (tree == null) {
            tree = new Tree(color);
            cache.put(color, tree);
            System.out.println("create " + color + " tree");
        }

        System.out.println(color + " tree");

        System.out.println("===========================================");
        return tree;
    }
}
