package com.assignment3;

import com.assignment3.controller.CandidateController;
import com.assignment3.dao.CandidateDAOImpl;
import com.assignment3.input.InputReader;
import com.assignment3.model.Candidate;
import com.assignment3.model.Seeker;
import com.assignment3.validator.Validator;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {
    private InputReader inputReader;
    private CandidateController candidateController;

    public Assignment3(InputReader inputReader, CandidateController candidateController) {
        this.inputReader = inputReader;
        this.candidateController = candidateController;
    }

    public InputReader getInputReader() {
        return inputReader;
    }

    public void setInputReader(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    public CandidateController getCandidateController() {
        return candidateController;
    }

    public void setCandidateController(CandidateController candidateController) {
        this.candidateController = candidateController;
    }

    public static void main(String[] args) {

        CandidateController candidateController = new CandidateController(new Validator(), new CandidateDAOImpl());
        InputReader inputReader = new InputReader(new Scanner(System.in));
        Assignment3 assignment3 = new Assignment3(inputReader, candidateController);
        while (true) {
            assignment3.run();
        }
    }

    public void run() {
        System.out.println("================= CANDIDATE MANAGEMENT SYSTEM ==================" + "\n" + "\n" +
                "\t1. Experience" + "\n" +
                "\t2. Fresher" + "\n" +
                "\t3. InternShip" + "\n" +
                "\t4. Searching" + "\n" +
                "\t5. Exit");

        try {
            int option = inputReader.readOption();
            Candidate candidate;
            switch (option) {
                case 1:
                case 2:
                case 3:
                    while (true) {
                        candidate = inputReader.readInput(option);
                        int statusCreateExperience = candidateController.createCandidate(candidate);
                        if (statusCreateExperience == 0) {
                            System.out.println("Error initializing candidate");
                        } else {
                            System.out.println("create success");
                        }
                        System.out.print("Do you want to continue (Y/N)?: ");
                        String choose = inputReader.getChoice();
                        if (!choose.equals("Y") && !choose.equals("y")) {
                            for (Candidate candidate1 : candidateController.getCandidates()) {
                                System.out.println(candidate1.toString());
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    Seeker seeker = inputReader.readSeeker();
                    try {
                        List<Candidate> result = candidateController.searchCandidate(seeker.getName(), seeker.getTypeOfCandidate());
                        if (result.size() != 0) {
                            for (Candidate candidate1 : result) {
                                System.out.println(candidate1.toString());
                            }
                        } else {
                            System.out.println("not found");
                        }
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("You do not press one of three numbers: 1, 2, 3, 4, or 5".toUpperCase());
            }
        } catch (InputMismatchException e) {
            System.out.println("you must press a number".toUpperCase());
        }
    }
}
