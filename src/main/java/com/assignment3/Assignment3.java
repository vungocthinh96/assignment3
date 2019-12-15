package com.assignment3;

import com.assignment3.controller.MainController;
import com.assignment3.dao.CandidateDAOImpl;
import com.assignment3.input.InputReader;
import com.assignment3.model.Candidate;
import com.assignment3.utils.Validator;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {
    private InputReader inputReader;
    private MainController mainController;

    public Assignment3(InputReader inputReader, MainController mainController) {
        this.inputReader = inputReader;
        this.mainController = mainController;
    }

    public InputReader getInputReader() {
        return inputReader;
    }

    public void setInputReader(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    public MainController getMainController() {
        return mainController;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public static void main(String[] args) {

        MainController mainController = new MainController(new Validator(), new CandidateDAOImpl());
        InputReader inputReader = new InputReader(new Scanner(System.in));
        Assignment3 assignment3 = new Assignment3(inputReader, mainController);
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
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please choose a option: ");
            int option = scanner.nextInt();
            Candidate candidate;
            switch (option) {
                case 1:
                case 2:
                case 3:
                    while(true) {
                        candidate = inputReader.readInput(option);
                        int createExperience = mainController.createCandidate(candidate);
                        if(createExperience == 0) {
                            System.out.println("Error initializing candidate");
                        } else {
                            System.out.println("create success");
                        }
                        System.out.print("Do you want to continue (Y/N)?: ");
                        String choose = scanner.next();
                        if (!choose.equals("Y") && !choose.equals("y")) {
                            for(Candidate candidate1: mainController.getCandidates()) {
                                System.out.println(candidate1.toString());
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Input Candidate name(First name or Last name): ");
                    String name = scanner.next();
                    System.out.print("Input type of candidate: ");
                    int typeOfCandidate = scanner.nextInt();
                    List<Candidate> result = mainController.searchCandidate(name, typeOfCandidate);
                    if (result.size() != 0) {
                        for (Candidate candidate1 : result) {
                            System.out.println(candidate1.toString());
                        }
                    }
                    else {
                        System.out.println("not found");
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
