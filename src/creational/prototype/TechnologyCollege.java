package creational.prototype;

public class TechnologyCollege extends College {
    private final String name;
    public String location;

    public TechnologyCollege() {
        this.name = "Technology college";
    }

    public TechnologyCollege(TechnologyCollege college) {
        super(college);
        this.name = college.name;
        this.location = college.location;
        System.out.println("Cloned TechnologyCollege.");
    }

    @Override
    public College cloneObject() {
        return new TechnologyCollege(this);
    }

    public void print() {
        System.out.println("[id:" + this.id + ",rank: " + this.rank + ", name: " + this.name + ", location: " + this.location + "]");
    }
}
