public class CO extends Sensor{
    private int concentration;
    private Boolean alarm;

    public CO(int concentration, String manufacturer, String location, Boolean state) {
        super(manufacturer,location,state);
        this.concentration = concentration;
        this.alarm = false;
    }

    public int getConcentration() {
        return concentration;
    }

    public void setConcentration(int concentration) {
        this.concentration = concentration;
    }

    public void toggleAlarm(int c){
        alarm = c > concentration;
        System.out.println("Co sensor alarm");
    }

    public void demoAlarm(){
        System.out.println("CO demo werkt");
    }
}
