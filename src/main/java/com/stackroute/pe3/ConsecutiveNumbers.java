package main.java.com.stackroute.pe3;
/*
find whethwe given numbers are consecutiv or not
 */
public class ConsecutiveNumbers {
    boolean result = false;
    public boolean checkForConsecutiveNumbers(String values)
    {
        String[] array = values.split(",");
        for (int i = 0; i < array.length - 1; i++) {
            int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]);
            System.out.println(difference);
            if (difference == 1 || difference == -1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
