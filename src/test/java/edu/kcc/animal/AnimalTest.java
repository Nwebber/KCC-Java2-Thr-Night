/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 *
 * @author marchauschildt
 */
public class AnimalTest {
    
    private Animal instance;

    @Before
    public void setUp() {
        instance = new Animal();
    }
    
    // TODO
    @org.junit.Test
    public void testGetId() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetId() {
        fail("The test case is a prototype.");
    }
    
    // TODO - This should not allow a second animal to have the same id as the first animal
    @org.junit.Test
    public void testSetIdBad() {
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetName() {
        setUp();
        String expected = "Unknown";
        String actual = instance.getName();
        assertEquals(expected, actual);
    }

    // TODO
    @org.junit.Test
    public void testSetName() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetGender() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetGender() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    public void testSetGenderNotMaleFemaleBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    public void testSetGenderMaleToFemaleBad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetSpecies() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetSpecies() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetSpeciesNotCatorDogBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetSpeciesCatToDogBad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetAge() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetAge0Good() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetAge100Good() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetAgeNegativeBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetAgeAbove100Bad() {
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetFixed() {
        System.out.println("getFixed");
        Animal instance = new Animal();
        boolean expResult = false;
        boolean result = instance.getFixed();
        assertEquals(expResult, result);
    }

    // TODO
    @org.junit.Test
    public void testSetFixedFalseToTrueGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetFixedTruetoFalseBad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetLegs() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetLegsTo4Good() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLegsTo0Good() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLegsTo5Bad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLegsToNegativeBad() {
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetWeight() {
        setUp();
        BigDecimal expected = new BigDecimal(0);
        BigDecimal actual = instance.getWeight();
        assertEquals(expected, actual);
    }

    // TODO
    @org.junit.Test
    public void testSetWeightToZeroGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetWeightTo1000Good() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetWeightNegativeBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetWeightAbove1000Bad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetDateAdded() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetDateAddedTodayGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetDateAddedAWeekAgoGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetDateAdded8DaysAgoBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetDateAddedTomorrowBad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetLastFeedingTime() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetLastFeedingTimeAnHourAgoGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLastFeedingTime2DaysAgoGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLastFeedingTime3DaysAgoBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLastFeedingTime1HourInTheFutureBad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testToString() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testCompareToCattoDog() {
        Animal cat = new Animal();
        cat.setSpecies("Cat");
        Animal dog = new Animal();
        dog.setSpecies("Dog");
        int result = cat.compareTo(dog);
        assertTrue(result==-1, "failed compare cat to dog");
    }
    
    // TODO
    @org.junit.Test
    public void testCompareToDogtoCat() {
        Animal cat = new Animal();
        cat.setSpecies("Cat");
        Animal dog = new Animal();
        dog.setSpecies("Dog");
        int result = dog.compareTo(cat);
        assertTrue(result==1, "failed compare dog to cat");
    }
    
    // TODO
    @org.junit.Test
    public void testCompareToCatAlphatoCatBeta() {
        Animal alpha = new Animal();
        alpha.setSpecies("Cat");
        alpha.setName("Alpha");
        Animal beta = new Animal();
        beta.setSpecies("Cat");
        beta.setName("Beta");
        int result = alpha.compareTo(beta);
        assertTrue(result==-1, "failed compare cat alpha to cat beta");
    }
    
    // TODO
    @org.junit.Test
    public void testCompareToCatBetatoCatAlpha() {
        Animal alpha = new Animal();
        alpha.setSpecies("Cat");
        alpha.setName("Alpha");
        Animal beta = new Animal();
        beta.setSpecies("Cat");
        beta.setName("Beta");
        int result = beta.compareTo(alpha);
        assertTrue(result==1, "failed compare cat beta to cat alpha");
    }
    
    // TODO
    @org.junit.Test
    public void testCompareToCatAlphatoCatAlpha() {
        Animal alpha = new Animal();
        alpha.setSpecies("Cat");
        alpha.setName("Alpha");
        Animal alpha2 = new Animal();
        alpha2.setSpecies("Cat");
        alpha2.setName("Alpha");
        int result = alpha.compareTo(alpha2);
        assertTrue(result==-1, "failed compare cat alpha to cat alpha");
    }
    
}
