package com.assignment3;

import com.assignment3.controller.MainController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment3 {
    private MainController mainController;

    public Assignment3(MainController mainController) {
        this.mainController = mainController;
    }

    public MainController getMainController() {
        return mainController;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        Assignment3 assignment3 = new Assignment3(mainController);
        while(true) {
            assignment3.run();
        }
    }

    public void run() {
        System.out.println("================= CANDIDATE MANAGEMENT SYSTEM =================="+"\n" +"\n"+
                "\t1. Experience"+"\n"+
                "\t2. Fresher"+"\n"+
                "\t3. InternShip"+"\n"+
                "\t4. Searching"+"\n"+
                "\t5. Exit");

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please choose a option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Experience");
                    break;
                case 2:
                    System.out.println("Fresher");
                    break;
                case 3:
                    System.out.println("InternShip");
                    break;
                case 4:
                    System.out.println("Searching");
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("You do not press one of three numbers: 1, 2, 3, 4, or 5".toUpperCase());
            }
        }catch (InputMismatchException e) {
            System.out.println("you must press a number".toUpperCase());
        }
    }
}
