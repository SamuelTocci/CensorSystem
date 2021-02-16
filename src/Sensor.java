public abstract class Sensor {
    //variables
    private String manufacturer;
    private String location;
    private Boolean state;

    public Sensor(String manufacturer, String location, Boolean state) {
        this.manufacturer = manufacturer;
        this.location = location;
        this.state = state;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public String getLocation() {
        return location;
    }
}

