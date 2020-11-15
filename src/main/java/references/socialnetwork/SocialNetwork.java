package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    private List<Member> members = new ArrayList<>();

    public void addMember(String name) {
         members.add(new Member(name));
    }

    public void connect(String name, String otherName) {
        Member memberToConnectTo = findByName(name);
        Member memberToBeConnected = findByName(otherName);
        if (memberToConnectTo != null && memberToBeConnected != null) {
            memberToConnectTo.connectMember(memberToBeConnected);
        }
    }

    private Member findByName(String nameToFind) {
        for (Member m : members) {
            if (m.getName().equals(nameToFind)) {
                return m;
            }
        }
        return null;
    }

    public List<String> bidirectionalConnections() {
        List<String> connections = new ArrayList<>();
        for (Member member : members) {
            for (Member connection : member.getConnections()) {
                Member connectedMember = findByName(connection.getName());
                if (connectedMember.getConnections().contains(member)) {
                    connections.add(member.getName() + " - " + connectedMember.getName());
                }
            }
        }
        return connections;
    }

    @Override
    public String toString() {
        return members.toString();
    }
}
