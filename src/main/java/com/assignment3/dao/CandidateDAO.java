package com.assignment3.dao;

import com.assignment3.model.Candidate;

import java.util.List;

public interface CandidateDAO {
    List<Candidate> getCandidates();
    int createCandidate(Candidate candidate);
    List<Candidate> searchCandidate(String name, int candidateType);
}
