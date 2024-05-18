package structural.bridge;

// This is Abstraction(like GUI interface) hierarchy.
// It follows composition and delegates the implementation to interface(hierarchy) concrete implementation.
// If we don't delegate, it needs to include all permutations and combinations of interface hierarchy
// - like combining all dimensions into one class. Here shape dimension and color dimension.

// We can extend this class for Specialized abstract like AdvancedShape etc.
// Other example: Remote(Abstraction) and Device-interface(implementations - Radio, TV).
// It is like converting monolithic system to independent dimension hierarchies.
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
