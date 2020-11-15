package attributes.person;

public class PersonMain {

//
//    Teszteld az osztályokat a PersonMain main() metódusában!
public static void main(String[] args) {
    Address address = new Address("Magyarország","Budapest", "Baross utca 133.", "1089");
    System.out.println("Rögzített cím: " + address.addressToString());
    address.correctData("Magyarország", "Baja", "Fő utca 19.", "8944");
    System.out.println("Megváltoztatott cím: " + address.addressToString());

    Person person = new Person("Kovács Árpád", "AA123456678");
    System.out.println("Rögzített személy: " + person.personToString() + " " + person.getAddress());
    person.moveTo(address);
    System.out.println("Rögzített személy és hozzárendelt címe: " + person.personToString() + " " + person.getAddress().addressToString());
    address.correctData("Magyarország","Budapest", "Baross utca 133.", "1089");
    System.out.println("Rögzített személy és megváltoztatott címe: " + person.personToString() + " " + person.getAddress().addressToString());

    System.out.println("Megváltoztatott személy adati:\n\tnév:\t\t" + person.getName() + "\n\tSzem.Ig:\t" + person.getIdentificationCard() + "\n\tCím\n\t\tVáros:\t" +
            person.getAddress().getCity() + "\n\t\t" + "Ország:\t" + person.getAddress().getCountry() + "\n\t\tIRSZ:\t" + person.getAddress().getZipCode() +
            "\n\t\tUtca\t" + person .getAddress().getStreetAndNumber());

    person.correctData("Kiss Ramóna","KR00774455");
    System.out.println("Megváltoztatott személy adati:\n\tnév:\t\t" + person.getName() + "\n\tSzem.Ig:\t" + person.getIdentificationCard() + "\n\tCím\n\t\tVáros:\t" +
            person.getAddress().getCity() + "\n\t\t" + "Ország:\t" + person.getAddress().getCountry() + "\n\t\tIRSZ:\t" + person.getAddress().getZipCode() +
            "\n\t\tUtca\t" + person .getAddress().getStreetAndNumber());


}
}
