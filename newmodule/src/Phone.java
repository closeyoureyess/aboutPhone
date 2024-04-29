public abstract class Phone {
    private String model, battery, colour, powerCPU, screenSize;
    public abstract void setAllCharacteristics(String model, String battery, String colour, String powerCPU, String screenSize);
    public abstract void getAllCharacteristics();
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
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public String getPowerCPU() {
        return powerCPU;
    }

    public void setPowerCPU(String powerCPU) {
        this.powerCPU = powerCPU;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

}
