package creational.builder;

public class House {
    private String name;
    private int floors;
    private int roomCount;

    public void setName(String name) {
        this.name = name;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    @Override
    public String toString() {
        return "House{" + "name='" + name + '\'' + ", floors=" + floors + ", roomCount=" + roomCount + '}';
    }
}
