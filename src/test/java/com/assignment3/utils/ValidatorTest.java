package com.assignment3.utils;

import org.junit.Test;
import static org.junit.Assert.*;
public class ValidatorTest {

    @Test
    public void testValidateDateOfBirth() {

    }

    @Test
    public void testValidatePhoneh() {

    }

    @Test
    public void testValidateEmail() {

    }

    @Test
    public void testValidateYearOfExperience() {

    }

    @Test
    public void testValidateRankOfGraduation() {
        Validator validator = new Validator();
        assertEquals(true,validator.validateRankOfGraduation("Poor"));
        assertEquals(true,validator.validateRankOfGraduation("Excellence"));
        assertEquals(true,validator.validateRankOfGraduation("Good"));
        assertEquals(true,validator.validateRankOfGraduation("Fair"));
        assertEquals(false,validator.validateRankOfGraduation("Fir"));
    }
}
