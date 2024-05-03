package creational.builder;

public class CivilEngineer {
    HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void makeHouse() {
        this.houseBuilder.buildHouseName();
        this.houseBuilder.buildHouseFloors();
        this.houseBuilder.buildHouseRoomCount();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
