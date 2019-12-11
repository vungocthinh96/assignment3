package com.assignment3.utils;

public class CommonUtils {
    public static boolean validateDateOfBirth(int dateOfBirth) {
        if((dateOfBirth > 1900) && (dateOfBirth < 2020))
            return true;
        return false;
    }

    public static boolean validatePhone(String phone) {
        return phone.matches("[0-9]+") && (phone.length() >= 10);
    }

    public static boolean validateEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public static boolean validateYearOfExperience(int yearExperience) {
        if(yearExperience >= 0 && yearExperience <= 100)
            return true;
        return false;
    }

    public static boolean validateRankOfGraduation(String rankOfGraduation) {
        return false;
    }
}
