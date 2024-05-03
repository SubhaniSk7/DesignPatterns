package creational.builder;

public class BuilderPatternMain {

    public void print() {

        NormalHouseBuilder normalHouseBuilder = new NormalHouseBuilder();

        CivilEngineer civilEngineer = new CivilEngineer(normalHouseBuilder);
        civilEngineer.makeHouse();
        House house = civilEngineer.getHouse();

        System.out.println(house.toString());

//        -------------------
        LuxuryHouseBuilder luxuryHouseBuilder = new LuxuryHouseBuilder();
        civilEngineer = new CivilEngineer(luxuryHouseBuilder);
        civilEngineer.makeHouse();
        House house2 = civilEngineer.getHouse();

        System.out.println(house2.toString());
    }
}
