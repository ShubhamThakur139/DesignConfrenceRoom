package DesignRound;

import java.util.ArrayList;

public class BuildingSystem {

    static ArrayList<Building> buildingList = new ArrayList<>();

    /** Add Building **/
    public void addBuilding(Building b){
        buildingList.add(b);
    }

    /** Add Floor to Given Building **/
    public void addFloorToBuilding(Building b1, Floor fl1) {
        if(buildingList.contains(b1)) b1.addFloor(fl1);
        else System.out.println("Building doesn't exist");
    }

    /** Add Confrence Room to Building **/
    public void addConfroomToFloorBuilding(Building b1, Floor fl1, Confroom c1) {
        if(buildingList.contains(b1)){
            if(b1.floorList.contains(fl1)){
                fl1.addConfroomIntoFloor(c1);
            }else{
                System.out.println("Floor doesn't exist! Enter Valid Floor");
            }
        }else{
            System.out.println("Building doesn't exist! Enter Valid Building");
        }
    }

    /** Get all Confrence room in a given building **/
    public void getAllConfrooom(Building b1) {
        if(buildingList.contains(b1)){
            System.out.println(b1);
        }else{
            System.out.println("Building doesn't exist! Enter Valid Building");
        }
    }

    /** Get all Bookings of confrence room **/
    public void allBookings(Building b1, Floor fl1) {
        if(buildingList.contains(b1)){
            if(b1.floorList.contains(fl1)){
                System.out.println(fl1.toString());
            }else{
                System.out.println("Floor doesn't exist! Enter Valid Floor");
            }
        }else{
            System.out.println("Building doesn't exist! Enter Valid Building");
        }
    }

    /** All slot to Confrence room **/
    public void bookSlot(String slot, Building b1, Floor fl1, Confroom c1) {
        if(buildingList.contains(b1)){
            if(b1.floorList.contains(fl1)){
                if(fl1.confroomList.contains(c1)){
                    if(c1.ableToBook(slot)){
                        if(c1.addSlot(slot)){
                            System.out.println("Slot Booked");
                        }else{
                            System.out.println("Given Slot is Already Booked");
                        }
                    }else{
                        System.out.println("You can Book Max 12hrs!!");
                    }
                }else{
                    System.out.println("Confrence Room doesn't exist! Enter Valid Confrence room");
                }
            }else{
                System.out.println("Floor doesn't exist! Enter Valid Floor");
            }
        }else{
            System.out.println("Building doesn't exist! Enter Valid Building");
        }
    }

    /** Cancel slot if it is booked **/
    public void cancelSlot(String slot, Building b1, Floor fl1, Confroom c1) {
        if(buildingList.contains(b1)){
            if(b1.floorList.contains(fl1)){
                if(fl1.confroomList.contains(c1)){
                    if(c1.cancelSlot(slot)){
                        System.out.println("Slot Cancelled");
                    }else{
                        System.out.println("Given Slot is Not Booked");
                    }
                }else{
                    System.out.println("Confrence Room doesn't exist! Enter Valid Confrence room");
                }
            }else{
                System.out.println("Floor doesn't exist! Enter Valid Floor");
            }
        }else{
            System.out.println("Building doesn't exist! Enter Valid Building");
        }
    }
}
