package com.assignment3.controller;

import com.assignment3.dao.CandidateDAOImpl;
import com.assignment3.model.Candidate;
import com.assignment3.model.Experience;
import com.assignment3.model.Fresher;
import com.assignment3.utils.Validator;

import java.util.List;

public class MainController {
    private Validator validator;
    private CandidateDAOImpl candidateDAO;

    public MainController(Validator validator, CandidateDAOImpl candidateDAO) {
        this.validator = validator;
        this.candidateDAO = candidateDAO;
    }

    public Validator getValidator() {
        return validator;
    }

    public void setValidator(Validator validator) {
        this.validator = validator;
    }

    public CandidateDAOImpl getCandidateDAO() {
        return candidateDAO;
    }

    public void setCandidateDAO(CandidateDAOImpl candidateDAO) {
        this.candidateDAO = candidateDAO;
    }

    public List<Candidate> getCandidates() {
        return candidateDAO.getCandidates();
    }

    public int createCandidate(Candidate candidate) {
        try {
            if (validateCandidate(candidate)) {
                return candidateDAO.createCandidate(candidate);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<Candidate> searchCandidate(String name, int candidateType) {
        return candidateDAO.searchCandidate(name, candidateType);
    }

    public boolean validateCandidate(Candidate candidate) {
        boolean check = false;
        if(validator.validateDateOfBirth(candidate.getBirthDate()) && validator.validatePhone(candidate.getPhone()) && validator.validateEmail(candidate.getEmail()))
            check = true;
        if((candidate instanceof Experience) && !validator.validateYearOfExperience(((Experience) candidate).getYearExperience())) {
            check = false;
        }
        if((candidate instanceof  Fresher) && !validator.validateRankOfGraduation((((Fresher) candidate).getRankOfGraduation()))) {
            check = false;
        }
        return check;
    }

}
