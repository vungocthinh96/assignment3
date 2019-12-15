package com.assignment3.model;

public class Intern extends Candidate{
    private String majorsName;
    private String semesterName;
    private String universityName;

    private Intern() {

    }

    public Intern(int id, String firstName,
                  String lastName, int birthDate,
                  String address, String phone,
                  String email, int candidateType,
                  String majorsName, String semesterName,
                  String universityName) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.majorsName = majorsName;
        this.semesterName = semesterName;
        this.universityName = universityName;
    }

    public String getMajorsName() {
        return majorsName;
    }

    public void setMajorsName(String majorsName) {
        this.majorsName = majorsName;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + majorsName + " | " + semesterName + " | " + universityName;
    }
}
