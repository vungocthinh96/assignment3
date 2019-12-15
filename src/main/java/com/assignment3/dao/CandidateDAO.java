package com.assignment3.dao;

import com.assignment3.model.Candidate;

public interface CandidateDAO {
    Candidate getCandidates();
    int createCandidate(Candidate candidate);
    Candidate searchCandidate(String name, int candidateType);
}
