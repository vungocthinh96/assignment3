package com.assignment3.controller;

import com.assignment3.dao.CandidateFileImpl;
import com.assignment3.model.Candidate;
import com.assignment3.model.ExperienceCandidate;

public class MainController {
    private InputReader inputReader;
    private CandidateFileImpl candidateFile;

    public MainController(InputReader inputReader, CandidateFileImpl candidateFile) {
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

    public CandidateFileImpl getCandidateFile() {
        return candidateFile;
    }

    public void setCandidateFile(CandidateFileImpl candidateFile) {
        this.candidateFile = candidateFile;
    }

    public Candidate createCandidate() {
        return new ExperienceCandidate();
    }
}
