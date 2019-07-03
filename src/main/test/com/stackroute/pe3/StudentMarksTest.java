package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.StudentMarks;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks student;
    @Before
    public void setUp()
    {
        student  = new StudentMarks();
    }
    @After
    public void tearDown()
    {
        student = null;
    }
    @org.junit.Test
    public void checkingTheStudentGradesWithoutError()
    {
        String message = student.checkingTheStudentGrades(5,new int[] {10,20,50,36,70});
        assertEquals("grades are checked with no errors",message);
    }
    @org.junit.Test
    public void checkingTheStudentGradesWithError()
    {
        String message = student.checkingTheStudentGrades(5,new int[] {10,-90,50,36,70});
        assertEquals("grades should be between 0 and 100",message);
    }

}