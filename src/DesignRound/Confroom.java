package DesignRound;

import java.util.HashSet;

public class Confroom {
    private String confroomID;
    /** 24 hours **/
    boolean timing[] = new boolean[25];
    HashSet<String> slots = new HashSet<>();

    public Confroom(String confroomID) {
        this.confroomID = confroomID;
    }

    public String getConfroomID() {
        return confroomID;
    }

    public void setConfroomID(String confroomID) {
        this.confroomID = confroomID;
    }

    public boolean ableToBook(String slot) {
        String[] to_from = slot.split(":");
        int to  = Integer.valueOf(to_from[0]);
        int from  = Integer.valueOf(to_from[1]);
        int totalTiming = from - to;
        return totalTiming<=12;
    }

    public boolean addSlot(String slot){
        String[] to_from = slot.split(":");
        int to  = Integer.valueOf(to_from[0]);
        int from  = Integer.valueOf(to_from[1]);
        for(int i=to;i<=from;i++){
            if(timing[i]){
                return false;
            }
        }
        for(int i=to;i<=from;i++){
            timing[i] = true;
        }
        slots.add(slot);
        return true;
    }

    public boolean cancelSlot(String slot){
        if(!slots.contains(slot)){
            return false;
        }
        String[] to_from = slot.split(":");
        int to  = Integer.valueOf(to_from[0]);
        int from  = Integer.valueOf(to_from[1]);
        for(int i=to;i<=from;i++){
            timing[i] = false;
        }
        slots.remove(slot);
        return true;
    }

    @Override
    public String toString() {
        return "Confroom{" +
                "confroomID='" + confroomID + '\'' +
                ", slots=" + slots +
                '}';
    }
}
