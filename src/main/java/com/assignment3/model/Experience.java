package com.assignment3.model;

public class Experience extends Candidate{
    private int yearExperience;
    private String proSkill;

    public Experience() {
    }

    public Experience(int id, String firstName,
                      String lastName, int birthDate,
                      String address, String phone,
                      String email, int candidateType,
                      int yearExperience, String proSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.yearExperience = yearExperience;
        this.proSkill = proSkill;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
