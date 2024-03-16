import java.util.Scanner;



class arrays {

    public static void main(String[] args) {
       /* 
        String[] cars = {"Mustang","Tesla","Coupe","Buggy","Dacia"};

        cars[2] = "Air Conveyer";
        System.out.println(cars[2]);
        */

        String [] cars = new String [5];

        cars[0] = "Mustang";
        cars[1] = "tesla";
        cars[2] = "Dacia";
        cars[3] = "Coupe";
        cars[4] = "Buggy";
       // System.out.println(cars[1]);

       for (int i=0; i<cars.length; i++){
           System.out.println(cars[i]);
       }
    }
}
