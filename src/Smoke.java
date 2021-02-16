public class Smoke extends Sensor{
    private Boolean heatMode;
    private Boolean alarm;

    public Smoke(Boolean heatMode,String manufacturer, String location, Boolean state) {
        super(manufacturer, location, state);
        this.heatMode = heatMode;
        this.alarm = false;
    }

    public Boolean getHeatMode() {
        return heatMode;
    }

    public void setHeatMode(Boolean heatMode) {
        this.heatMode = heatMode;
    }

    public void toggleAlarm(Boolean smoke,Boolean heat){
        if (heatMode){
            alarm = heat || smoke;
            System.out.println("heat or smoke detected");
        }
        else{
            alarm = smoke;
            System.out.println("smoke detected");
        }

    }

    public void demoAlarm(){
        System.out.println("smoke demo werkt");
    }

}
