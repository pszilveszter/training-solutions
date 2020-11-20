package introjunit;

public class Gentleman {
    public String sayHello(String name) {
        if (name == null) {
            name = "Anonymus";
        }
        return "Hello" + name;
    }
}
