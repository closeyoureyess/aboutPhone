public class Main {
    public static void main(String[] args) {
        //Xiaomi
        Xiaomi xiaomi = new Xiaomi();
        xiaomi.powerOn();
        xiaomi.setAllCharacteristics("Xiaomi Note 3 Pro", "3000 mAh", "Yellow", "3000 MHz", "1980x1080");
        xiaomi.getAllCharacteristics();
        xiaomi.powerOff();
        //Iphone
        Iphone iphone = new Iphone();
        iphone.powerOn();
        iphone.setAllCharacteristics("Apple Iphone 12", "2900 mAh", "White", "3150 MHz", "1980x1080");
        iphone.getAllCharacteristics();
        iphone.powerOff();
    }
}