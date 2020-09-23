package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JobTest {

    Job test_job;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;
    Job test_job6;
    Job test_job7;

    @Before
    public void createJobObject() {

        test_job = new Job("Web Developer", new Employer("Centene"), new Location("St. Louis"), new PositionType("Developer"), new CoreCompetency("JavaScript"));
    }

    @Before
    public void createJobObject2() {

        test_job2 = new Job("Web Designer", new Employer("Clayco"), new Location("Overland"), new PositionType("Front End Developer"), new CoreCompetency("React"));
    }

    @Test
    public void testSettingJobId() {
        assertFalse((test_job.getId()) == (test_job2.getId()));
    }

    @Before
    public void createJobObjectForFields(){
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        assertEquals(test_job3.getName(), "Product tester");
        assertEquals(test_job3.getEmployer().getValue(), "ACME");
        assertEquals(test_job3.getLocation().getValue(), "Desert");
        assertEquals(test_job3.getPositionType().getValue(), "Quality control");
        assertEquals(test_job3.getCoreCompetency().getValue(), "Persistence");

    }

    private void assertEquals(String name, String product_tester) {
    }

    @Before
    public void createJobOjectForEquality() {
        test_job4 = new Job ("Database Specialist", new Employer("ABC"), new Location("Rainforest"), new PositionType("Data"), new CoreCompetency("SQL"));
    }

    @Before
    public void create2ndJobObjectForEquality() {
        test_job5 = new Job ("Database Specialist", new Employer("ABC"), new Location("Rainforest"), new PositionType("Data"), new CoreCompetency("SQL"));

    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job4 == test_job5);
    }

    @Before
    public void createJob6() {
        test_job6 = new Job ("Database Specialist", new Employer("ABC"), new Location("Rainforest"), new PositionType("Data"), new CoreCompetency("SQL"));
    }
    @Test
    public void testToString(){
        assertEquals("\n" +
                "ID:  \n" +
                "Name: Database Specialist\n" +
                "Employer: ABC\n" +
                "Location: Rainforest\n" +
                "Position Type: Data \n" +
                "Core Competency: SQL \n" +
                "\n", test_job6.toString());
    }

    @Before
    public void createJob7() {
        test_job7 = new Job ("Database Specialist", new Employer("ABC"), new Location("Rainforest"), new PositionType(""), new CoreCompetency("SQL"));
    }

    @Test
    public void testEmptyField(){
        assertEquals("\n" +
                "ID:  \n" +
                "Name: Database Specialist\n" +
                "Employer: ABC\n" +
                "Location: Rainforest\n" +
                "Position Type: Data Not Available \n" +
                "Core Competency: SQL \n" +
                "\n", test_job7.toString());
        System.out.println(test_job7.toString());
    }


}
