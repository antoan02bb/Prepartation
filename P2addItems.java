package AssociativeArrays;

import java.util.HashMap;

// To add items to the HashMap class use the put() method
public class P2addItems {
    public static void main(String[] args) {


        HashMap<String, String> capitalCities = new HashMap<String, String>();

        //Add keys and values (Country, City)
        capitalCities.put("Bulgaria", "Sofia");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Turkey", "Ankara");
        System.out.println(capitalCities);
    }
}
