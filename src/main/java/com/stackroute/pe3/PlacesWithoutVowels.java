package main.java.com.stackroute.pe3;
/*
remove vowels and print the string
 */
public class PlacesWithoutVowels {
    public static String[] convertPlaceNamesWithoutVowels(String[] places) {

        for (int i = 0; i < places.length; i++) {
            if(places[i]==" ")
                System.out.println("error should not give empty string");
            places[i]= places[i].replaceAll("[aeiouAEIOU]", "");
        }
        return places;
    }


}
