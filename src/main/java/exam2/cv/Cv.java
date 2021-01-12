package exam2.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private final String name;
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
        for (String skillText: newSkills)
        {
            String skillName = skillText.substring(0, skillText.indexOf("(") - 1);
            int level = Integer.parseInt(skillText.substring(skillText.indexOf("(") + 1, skillText.indexOf(")")));
            skills.add(new Skill(skillName, level));
        }
    }

    public int findSkillLevelByName(String skillName) {
        for (Skill skill: skills) {
            if (skillName.equalsIgnoreCase(skill.getName())) {
                return skill.getLevel();
            }
        }
        throw new SkillNotFoundException();
    }

}
