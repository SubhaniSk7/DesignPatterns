package creational.builder;

public class NormalHouseBuilder implements HouseBuilder {

    private final House house;

    public NormalHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildHouseName() {
        this.house.setName("Normal");
    }

    @Override
    public void buildHouseFloors() {
        this.house.setFloors(2);
    }

    @Override
    public void buildHouseRoomCount() {
        this.house.setRoomCount(3);
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
