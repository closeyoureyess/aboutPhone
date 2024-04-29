import java.util.Objects;

public class Xiaomi extends Phone implements OtherActions {

    private String message, status;

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println(message);
    }

    @Override
    public void power(String status) {
        //this.status = "Включен";
        if(on.equals(status)){
            System.out.println("Устройство включено");
        }
        else{
            System.out.println("Тест");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Xiaomi xiaomi = (Xiaomi) o;
        return Objects.equals(message, xiaomi.message) && Objects.equals(status, xiaomi.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, status);
    }

    @Override
    public void soundTurnOn() {
        System.out.println("Din-Don");
    }
}

