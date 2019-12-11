package com.assignment3.model;

public class FresherCandidate extends Candidate{
    private String graduateTime;
    private String rankOfGraduation;
    private String education;

    public FresherCandidate(int id, String firstName,
                            String lastName, int birthDate,
                            String address, String phone,
                            String email, String candidateType,
                            String graduateTime, String
                                    rankOfGraduation, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduateTime = graduateTime;
        this.rankOfGraduation = rankOfGraduation;
        this.education = education;

    }

    public String getGraduateTime() {
        return graduateTime;
    }

    public void setGraduateTime(String graduateTime) {
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
}
