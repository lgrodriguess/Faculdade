package com.github.lgrodriguess.ex05;
public class WheelManager {
    private List<Wheel> wheelsList;
    
    public WheelManager() {
        this.wheelsList = new ArrayList<>();
    }
    
    public void addWheel(Wheel e) {
        wheelsList.add(e);
    }
    
    public void removeWheel(int i) {
        wheelsList.remove(i);
    }
    
    public Wheel searchByIndex(int i) {
        return wheelsList.get(i);
    }
    
    public void showWheels() {
        for(Wheel w : wheelsList) {
            System.out.println(w);
        } 
    }
}
