package DesignRound;

import java.util.ArrayList;

public class Building {
    private String buildingId;

    ArrayList<Floor> floorList = new ArrayList<>();

    public Building(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public void addFloor(Floor floor){
        floorList.add(floor);
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingId='" + buildingId + '\'' +
                ", floorList=" + floorList +
                '}';
    }
}
