import java.util.ArrayList;

public class Central {
    //variables
    private ArrayList<Sensor> sensorList;
    private String name;

    enum Size {small, medium, large}

    Size size;
    //constructor
    public Central(String name, Size size) {
        this.name = name;
        switch(size){
            case small: this.size = Size.small;
            case medium: this.size = Size.medium;
            case large: this.size = Size.large;
        }
        sensorList = new ArrayList<Sensor>();
    }
    //main
    public void addSensor(Central c, Sensor s){
        for(Sensor item : c.getSensorList()){
            if(item.getManufacturer() != s.getManufacturer() && item.getLocation() != s.getLocation() && item.getClass() != s.getClass()){
                c.sensorList.add(s);
            }
        }
    }

    public ArrayList<Sensor> getSensorList() {
        return sensorList;
    }

    public int testSensor(Central c,Sensor s){
        (s.getClass())s.demoAlarm();
        return sensorList.indexOf(s);
    }
}