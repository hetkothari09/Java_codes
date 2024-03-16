import java.util.Scanner;

class math {

     public static void main (String[] args){
    /*
           double x;
           double y;
            double z;
*/ 
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter side x: ");
        double x = input.nextDouble();
        System.out.print("Enter size y: ");
        double y = input.nextDouble();

        double z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is "+z);



    }
    
}
