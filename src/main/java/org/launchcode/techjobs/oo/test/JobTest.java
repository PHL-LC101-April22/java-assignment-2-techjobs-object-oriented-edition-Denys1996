package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job myJobs1 = new Job();
        Job myJobs2 = new Job();
        int myJobs1Id = myJobs1.getId();
        int myJobs2Id = myJobs2.getId();
        assertNotEquals(myJobs1Id, myJobs2Id);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job myJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //assertTrue
        assertTrue(myJob1.getName() == "Product tester");
        assertTrue(myJob1.getEmployer() instanceof Employer);
        assertTrue(myJob1.getLocation() instanceof Location);
        assertTrue(myJob1.getPositionType() instanceof PositionType);
        assertTrue(myJob1.getCoreCompetency() instanceof CoreCompetency);
        //assertEquals
        assertEquals("Product tester", myJob1.getName());
        assertEquals("ACME", myJob1.getEmployer().getValue());
        assertEquals("Desert", myJob1.getLocation().getValue());
        assertEquals("Quality control", myJob1.getPositionType().getValue());
        assertEquals("Persistence", myJob1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job myJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job myJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(myJobOne, myJobTwo);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job myJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char fistChar = myJobOne.toString().charAt(0);
        char lastChar = myJobOne.toString().charAt(myJobOne.toString().length()-1);
        assertEquals(fistChar, '\n');
        assertEquals(lastChar, '\n');

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job myJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(myJobOne.toString().contains("ID: " + myJobOne.getId()));
        assertTrue(myJobOne.toString().contains("Name: " + myJobOne.getName()));
        assertTrue(myJobOne.toString().contains("Employer: " + myJobOne.getEmployer().getValue()));
        assertTrue(myJobOne.toString().contains("Location: " + myJobOne.getLocation().getValue()));
        assertTrue(myJobOne.toString().contains("Position Type: " + myJobOne.getPositionType().getValue()));
        assertTrue(myJobOne.toString().contains("Core Competency: " + myJobOne.getCoreCompetency().getValue()));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job myJobOne = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         myJobOne.toString();
         assertEquals("Data not available", myJobOne.getEmployer().getValue());
    }


}
