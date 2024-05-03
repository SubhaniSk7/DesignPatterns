package creational.builder;

public interface HouseBuilder {

    void buildHouseName();

    void buildHouseFloors();

    void buildHouseRoomCount();

    House getHouse();
}
