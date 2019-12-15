package com.assignment3.input;

import com.assignment3.database.MockDatabase;
import com.assignment3.model.Candidate;
import com.assignment3.model.Experience;
import com.assignment3.model.Fresher;
import com.assignment3.model.Intern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Candidate readInput(int option) {
        Candidate candidate = null;
        try {
            System.out.print("First Name:");
            String firstName = scanner.next();

            System.out.print("Last Name:");
            String lastName = scanner.next();

            System.out.print("Date Of Birth:");
            int birthDate = scanner.nextInt();

            System.out.print("Address:");
            String address = scanner.next();

            System.out.print("Phone:");
            String phone = scanner.next();

            System.out.print("Email:");
            String email = scanner.next();

            int candidateType = option - 1;

            if(candidateType == 0) {
                System.out.print("Year Experience:");
                int yearExperience = scanner.nextInt();
                System.out.print("Professional Skill:");
                String proSkill = scanner.next();
                candidate = new Experience(MockDatabase.candidates.size() + 1, firstName, lastName, birthDate, address, phone, email, candidateType, yearExperience, proSkill);
                return candidate;
            }

            if(candidateType == 1) {
                System.out.print("Graduate Time:");
                int graduateTime = scanner.nextInt();
                System.out.print("Rank Of Graduation:");
                String rankOfGraduation = scanner.next();
                System.out.print("Education:");
                String education = scanner.next();
                candidate = new Fresher(MockDatabase.candidates.size() + 1, firstName, lastName, birthDate, address, phone, email, candidateType, graduateTime, rankOfGraduation, education);
                return candidate;
            }

            if(candidateType == 2) {
                System.out.print("Majors Name:");
                String majorsName = scanner.next();
                System.out.print("Semester Name:");
                String semesterName = scanner.next();
                System.out.print("University Name:");
                String universityName = scanner.next();
                candidate = new Intern(MockDatabase.candidates.size() + 1, firstName, lastName, birthDate, address, phone, email, candidateType, majorsName, semesterName, universityName);
                return candidate;
            }
            else {
                candidate = new Candidate();
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter the wrong data type");;
        }
        return candidate;
    }
}
