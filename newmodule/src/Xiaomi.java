import java.util.Objects;
public class Xiaomi extends Phone implements OtherActions {

    private String message, status;

    @Override
    public String powerOn() {
        return on;
    }
    @Override
    public String powerOff() {
        return off;
    }

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println(message);
    }

    @Override
    public void soundTurnOn() {
        System.out.println("Din-Don");
    }

    @Override
    public void call() {
        System.out.println("Звонок по телефону");
    }

    @Override
    public void getAllCharacteristics() {
        System.out.println("Модель телефона:" + getModel()+"\n"+
                "Цвет телефона:" + getColour()+"\n"+"Емкость батареи, миллиампер/ч:" + getBattery()+"\n"+
                "Мощность процессора:" + getPowerCPU()+"\n"+"Размер экрана:" + getScreenSize());
    }

    @Override
    public void setAllCharacteristics(String model, String battery, String colour, String powerCPU, String screenSize) {
        setModel(model);
        setBattery(battery);
        setColour(colour);
        setPowerCPU(powerCPU);
        setScreenSize(screenSize);
    }

}

