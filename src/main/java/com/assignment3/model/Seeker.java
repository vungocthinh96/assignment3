package com.assignment3.model;

public class Seeker {
    private String name;
    private int typeOfCandidate;

    public Seeker(String name, int typeOfCandidate) {
        this.name = name;
        this.typeOfCandidate = typeOfCandidate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeOfCandidate() {
        return typeOfCandidate;
    }

    public void setTypeOfCandidate(int typeOfCandidate) {
        this.typeOfCandidate = typeOfCandidate;
    }
}
