package com.assignment3.controller;

import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public void readInput() {
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Date Of Birth: ");
        int birthDate = scanner.nextInt();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        System.out.println("Phone: ");
        String phone = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Candidate Type: ");
        int candidateType = scanner.nextInt();

    }
}
