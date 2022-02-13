package DesignRound;

public class RunnerClass {
    public static void main(String[] args) {
        BuildingSystem buildingSystem = new BuildingSystem();
        /** Adding building **/
        Building b1 = new Building("b1");
        buildingSystem.addBuilding(b1);
        /** Adding Floor to Building **/
        Floor fl1 = new Floor("1");
        Floor fl2 = new Floor("2");
        buildingSystem.addFloorToBuilding(b1,fl1);
        buildingSystem.addFloorToBuilding(b1,fl2);
        /** Adding Confrence Room to Floor **/
        Confroom c1 = new Confroom("c1");
        Confroom c2 = new Confroom("c2");
        Confroom c3 = new Confroom("c3");
        buildingSystem.addConfroomToFloorBuilding(b1,fl1,c1);
        buildingSystem.addConfroomToFloorBuilding(b1,fl1,c2);
        buildingSystem.addConfroomToFloorBuilding(b1,fl2,c3);

        /** Boot Slot to given Confrence room **/
        buildingSystem.bookSlot("1:5",b1,fl1,c1);
        buildingSystem.bookSlot("4:9",b1,fl1,c2);
        buildingSystem.bookSlot("8:9",b1,fl2,c3);

        /** Cancel Slot to given Confrence room **/
        buildingSystem.cancelSlot("12:14",b1,fl1,c1);
        buildingSystem.cancelSlot("4:9",b1,fl1,c2);

        /** List all Bookings of a given Building **/
        buildingSystem.allBookings(b1,fl1);
        buildingSystem.allBookings(b1,fl2);

        /** Get All Confrence Room in Given Building **/
//        buildingSystem.getAllConfrooom(b1);
    }
}


//0 to 24;