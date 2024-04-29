public abstract class Phone {
    private String model, battery, status;

    public abstract void soundTurnOn();
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBattery(){
        return battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }
    //*public void getStatus() {
        //return status;
    //}
}
