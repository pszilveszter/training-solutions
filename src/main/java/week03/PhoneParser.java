package week03;

public class PhoneParser {
    //private Phone phoneParser;

    public Phone phoneParser(String input) {
        String preffix = input.substring(0, 2);
        String number = input.substring(3);
        Phone phone = new Phone(preffix,number);
        return phone;
    }

    public static void main(String[] args) {
        PhoneParser phoneParser = new PhoneParser();
        String number = "30-1234567";
        Phone phone = phoneParser.phoneParser(number);
        System.out.println(phone.getPrefix());
        System.out.println(phone.getNumber());
        System.out.println(phone);
    }
}