import java.util.Scanner;

class dimensionalarrays {
    public static void main(String[] args) {
        
        String [] [] cars = new String[3][3];

        cars [0][0] = "Tesla";
        cars [0][1] = "Mustang";
        cars [0][2] = "coupe";
        cars [1][0] = "Dacia";
        cars [1][1] = "Audi";
        cars [1][2] = "BMW";
        cars [2][0] = "Ferrari";
        cars [2][1] = "Lamborghini";
        cars [2][2] = "UAZ";
        

        for (int i=0; i<cars.length; i++){
        System.out.println();
            for (int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+ " ");
            }
        }
            System.out.println();
            System.out.println();
    }
}
