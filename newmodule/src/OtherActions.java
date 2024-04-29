public interface OtherActions {
    String on = "Включено";
    String off = "Выключено";
    String exceptionWarn = "Ошибка";
    void sendMessage(String message);
    void soundTurnOn();
    void call();
    String powerOn();
    String powerOff();

}
