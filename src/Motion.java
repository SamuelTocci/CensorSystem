public class Motion extends Sensor{
    private float range;

    private Boolean alarm;

    public Motion(float distance, String manufacturer, String location, Boolean state) {
        super(manufacturer, location, state);
        this.range = distance;
        this.alarm = false;
    }

    public float getDistance() {
        return range;
    }

    public void setDistance(float distance) {
        this.range = distance;
    }

    public void toggleAlarm(float distance){
        alarm = distance < range;
        System.out.println("Motion sensor alarm");
    }

    public void demoAlarm(){
        System.out.println("Motion demo werkt");
    }
}
