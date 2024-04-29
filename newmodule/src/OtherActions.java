public interface OtherActions {
    String on = "Включено";
    String off = "Выключено";
    void sendMessage(String message);
    void power(String status);
}
