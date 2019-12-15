package com.assignment3.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Validator {
    public boolean validateDateOfBirth(int dateOfBirth) {
        if((dateOfBirth > 1900) && (dateOfBirth < 2020))
            return true;
        return false;
    }

    public boolean validatePhone(String phone) {
        return phone.matches("[0-9]+") && (phone.length() >= 10);
    }

    public boolean validateEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public boolean validateYearOfExperience(int yearExperience) {
        if(yearExperience >= 0 && yearExperience <= 100)
            return true;
        return false;
    }

    public boolean validateRankOfGraduation(String rankOfGraduation) {
        List<String> ranksList = Arrays.asList("Excellence", "Good", "Fair", "Poor");
        if(ranksList.contains(rankOfGraduation))
            return true;
        return false;
    }
}
