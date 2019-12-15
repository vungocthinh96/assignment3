package com.assignment3.model;

public class Fresher extends Candidate{
    private int graduateTime;
    private String rankOfGraduation;
    private String education;

    public Fresher() {
    }

    public Fresher(int id, String firstName,
                   String lastName, int birthDate,
                   String address, String phone,
                   String email, int candidateType,
                   int graduateTime, String
                                    rankOfGraduation, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduateTime = graduateTime;
        this.rankOfGraduation = rankOfGraduation;
        this.education = education;

    }

    public int getGraduateTime() {
        return graduateTime;
    }

    public void setGraduateTime(int graduateTime) {
        this.graduateTime = graduateTime;
    }

    public String getRankOfGraduation() {
        return rankOfGraduation;
    }

    public void setRankOfGraduation(String rankOfGraduation) {
        this.rankOfGraduation = rankOfGraduation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString() + "," + graduateTime + "," + rankOfGraduation + "," + education;
    }
}
