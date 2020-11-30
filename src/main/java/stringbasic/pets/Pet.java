package stringbasic.pets;

import java.time.LocalDate;

public class Pet {

    private String name;
    private LocalDate bday;
    private Gender gender;
    private String reg;

    public Pet(String name, LocalDate bday, Gender gender, String reg) {

        if (reg.length() != 6) {
            throw new IllegalArgumentException(reg + " is not a valid registration number!");
        }

        int i = 0;
        try {
            for (; i < reg.length(); i++) {
                int n = Integer.parseInt(reg.charAt(i) + "");
            }
        }
        catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException(reg.charAt(i) + " is not a numeric value!");
        }

        this.name = name;
        this.bday = bday;
        this.gender = gender;
        this.reg = reg;
    }


    public String getName() {
        return name;
    }

    public LocalDate getBday() {
        return bday;
    }

    public Gender getGender() {
        return gender;
    }

    public String getReg() {
        return reg;
    }
}
