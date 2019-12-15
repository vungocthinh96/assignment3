package com.assignment3.dao;

import com.assignment3.database.MockDatabase;
import com.assignment3.model.Candidate;

import java.util.List;

public class CandidateDAOImpl implements CandidateDAO{
    @Override
    public List<Candidate> getCandidates() {

        return null;
    }

    @Override
    public int createCandidate(Candidate candidate) {
        MockDatabase.candidates.add(candidate);
        return 1;
    }

    @Override
    public List<Candidate> searchCandidate(String name, int candidateType) {
        List<Candidate> candidates = null;
        for(Candidate candidate1: MockDatabase.candidates) {
            if((candidate1.getFirstName().equals(name) || candidate1.getLastName().equals(name)) && candidate1.getCandidateType() == candidateType) {
                candidates.add(candidate1);
                break;
            }
        }
        return candidates;
    }
}
