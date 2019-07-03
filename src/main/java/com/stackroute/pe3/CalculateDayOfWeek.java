package main.java.com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/*
calculate first and last date of the week
 */
public class CalculateDayOfWeek {
    public static String calculateFirstAndLastDateOfTheWeek()
    {
        String str="";
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        str=str+df.format(c.getTime());
        for(int i=0;i<6;i++)
        {
            c.add(Calendar.DATE,1);
        }
        return str+df.format(c.getTime());


    }
}
