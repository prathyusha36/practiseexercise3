package main.java.com.stackroute.pe3;
/*
this method checks whether grade of students are between 0-100 otherwise throws error
 */
public class StudentMarks {
    public static String checkingTheStudentGrades(int numOfStudents,int[] grades)
    {
        int count=0;
        for(int i=0;i<numOfStudents;i++)
        {
            if(grades[i]>=0 && grades[i]<=100)
                count++;
        }
        if(count==numOfStudents)
            return "grades are checked with no errors";
        else
            return "grades should be between 0 and 100";
    }
}
