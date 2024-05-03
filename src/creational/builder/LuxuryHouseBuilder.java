package creational.builder;

public class LuxuryHouseBuilder implements HouseBuilder {
    private final House house;

    public LuxuryHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildHouseName() {
        this.house.setName("Luxury");
    }

    @Override
    public void buildHouseFloors() {
        this.house.setFloors(20);
    }

    @Override
    public void buildHouseRoomCount() {
        this.house.setRoomCount(300);
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
