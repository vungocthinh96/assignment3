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
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Date Of Birth: ");
            int birthDate = scanner.nextInt();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Phone: ");
            String phone = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            int candidateType = option - 1;

            if(candidateType == 0) {
                System.out.print("Year Experience: ");
                int yearExperience = scanner.nextInt();
                System.out.print("Professional Skill: ");
                String proSkill = scanner.nextLine();
                candidate = new Experience(MockDatabase.candidates.size() + 1, firstName, lastName, birthDate, address, phone, email, candidateType, yearExperience, proSkill);
                return candidate;
            }

            if(candidateType == 1) {
                System.out.println("Graduate Time: ");
                int graduateTime = scanner.nextInt();
                System.out.println("Rank Of Graduation: ");
                String rankOfGraduation = scanner.nextLine();
                System.out.println("Education: ");
                String education = scanner.nextLine();
                candidate = new Fresher(MockDatabase.candidates.size() + 1, firstName, lastName, birthDate, address, phone, email, candidateType, graduateTime, rankOfGraduation, education);
                return candidate;
            }

            if(candidateType == 2) {
                System.out.println("Majors Name: ");
                String majorsName = scanner.nextLine();
                System.out.println("Semester Name: ");
                String semesterName = scanner.nextLine();
                System.out.println("University Name: ");
                String universityName = scanner.nextLine();
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
