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
        memberToConnectTo.connectMember(memberToBeConnected);
    }

    private Member findByName(String nameToFind) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(nameToFind)) {
                return members.get(i);
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
                    String result = member.getName() + " - " + connectedMember.getName();
                    connections.add(result);
                }
            }
        }
        return connections;
    }
}
