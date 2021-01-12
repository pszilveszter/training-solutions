package exam2.cv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public Cv(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return List.copyOf(skills);
    }

    public void addSkills(String... newSkills) {
        for (int i = 0; i < newSkills.length; i++) {
            String input = newSkills[i];
            String name = input.substring(0, input.indexOf("(") - 1);
            int level = Integer.parseInt(input.substring(input.indexOf("(") + 1, input.indexOf(")")));
            skills.add(new Skill(name, level));
        }
    }

    public int findSkillLevelByName(String skillName) {
        for (Skill skill: skills) {
            if (skillName.equalsIgnoreCase(skill.getName())) {
                return skill.getLevel();
            }
        }
        //throw new SkillNotFoundException();
        return 0;
    }

}
