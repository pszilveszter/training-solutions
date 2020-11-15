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
}
