//import java.lang.reflect.Array;
import java.util.*;
//import java.util.stream.Sink.ChainedDouble;
class twodimensionalarraylists {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();


        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Bread");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("Tomatoes");
        produceList.add("Potatoes");
        produceList.add("Capcicum");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("Red Bull");
        drinksList.add("Thumbs Up");
       
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println();

    //    System.out.println(bakeryList);
    //    System.out.println(drinksList);
    //    System.out.println(produceList);
    //    System.out.println(groceryList);
        
        System.out.println(groceryList.get(2).get(0));
        System.out.println();
        System.out.println(); 

    }
    
}