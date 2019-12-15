package com.assignment3.controller;

import com.assignment3.dao.CandidateFileDAOImpl;
import com.assignment3.model.Candidate;
import com.assignment3.model.Experience;

public class MainController {
    private InputReader inputReader;
    private CandidateFileDAOImpl candidateFile;

    public MainController(InputReader inputReader, CandidateFileDAOImpl candidateFile) {
        this.inputReader = inputReader;
        this.candidateFile = candidateFile;
    }

    public MainController() {
    }

    public InputReader getInputReader() {
        return inputReader;
    }

    public void setInputReader(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    public CandidateFileDAOImpl getCandidateFile() {
        return candidateFile;
    }

    public void setCandidateFile(CandidateFileDAOImpl candidateFile) {
        this.candidateFile = candidateFile;
    }

    public Candidate createCandidate() {
        return new Experience();
    }
}
