package references.socialnetwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Member {
    private String name;
    private List<Member> connections;

    public Member(String name) {
        this.name = name;
        this.connections = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Member> getConnections() {
        return connections;
    }

    public void connectMember(Member member) {
        connections.add(member);
    }


    private List<String> connectedNames() {
        List<String> connected = new ArrayList<>();
        for (Member m : connections) {
            connected.add(m.getName());
        }
        return connected;
    }

    @Override
    public String toString() {
        return name + connectedNames();
        //return name + " " + connections.toString(); //Körkörös hivatkozás, azaz az adott példány csatolt Member objektumainak, és így azoknak a csatolt Member objektumait is vissza akarja adni, pl az eredeti Memer-t is ami ismét kéri a a csatolt Mermer-eket, stb....
    }
}
