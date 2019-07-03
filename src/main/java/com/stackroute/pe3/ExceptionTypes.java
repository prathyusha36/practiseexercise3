package main.java.com.stackroute.pe3;

public class ExceptionTypes {
    //method for NegativeArraySizeException
    public String arrayCreation(){
        String strNegativeSize = null;
        try {
            int arr[] = new int[-2];

        }
        catch (NegativeArraySizeException n){
            strNegativeSize=n.getClass().toString();
        }
        finally {
            System.out.println("running array creation finally");
        }
        return strNegativeSize;
    }
    //method for ArrayIndexOutOfBoundsException
    public String arrayAccess(){
        String strIndex = null;
        try {
            int arr[] = new int[10];
            int a = arr[11];
        }
        catch (ArrayIndexOutOfBoundsException a){
            strIndex = a.getClass().toString();
        }
        finally {
            System.out.println("running array access finally");
        }
        return strIndex;
    }
    //method for NullPointerException
    public String stringAccess(){
        String str = null;
        String strNull = null;
        try{
            char a = str.charAt(0);
        }
        catch (NullPointerException n){
            strNull = n.getClass().toString();
        }
        finally {
            System.out.println("running string access finally");
        }
        return strNull;
    }

}
