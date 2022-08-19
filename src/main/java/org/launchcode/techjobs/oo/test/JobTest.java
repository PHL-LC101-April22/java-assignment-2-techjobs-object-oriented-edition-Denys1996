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
        boolean constructorCorrectlyAssigned = myJob1 instanceof Job;
        assertEquals("Product tester", myJob1.getName());
        assertEquals("ACME", myJob1.getEmployer().toString());
        assertEquals("Desert", myJob1.getLocation().toString());
        assertEquals("Quality control", myJob1.getPositionType().toString());
        assertEquals("Persistence", myJob1.getCoreCompetency().toString());
        assertTrue(constructorCorrectlyAssigned);
    }

    @Test
    public void testJobsForEquality() {
        Job myJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job myJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(myJobOne, myJobTwo);
    }

}
