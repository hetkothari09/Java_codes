import java.lang.reflect.Array;
import java.util.ArrayList;

class arraylist {
     public static void main(String[] args) {
         
    // ArrayList = a resizable array
    //                Elements can be added and removed after compilation Phase
    //                store references data types

    ArrayList<String> food = new ArrayList<String>();

    food.add("Pizza");
    food.add("Burger");
    food.add("Garlic Bread");

    food.set(0, "Cheese Pizza");
    food.remove(1);
    food.clear();
    for (int i=0; i<food.size(); i++){
        System.out.println(food.get(i));
    }


     }
    
}
