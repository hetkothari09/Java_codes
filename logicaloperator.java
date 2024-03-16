import java.util.Scanner;

class logicaloperator {

    public static void main (String [] args){

    /*  logical operators = used to connect two or more expressions 

        && = (AND) both conditions must be true
        || = (OR) either of the conditions must be true
        ! = (NOT) reverses the boolean value of the conditions
    
     */        

     //int temp = 25;

     Scanner scanner = new Scanner(System.in);

     // System.out.println("Enter the temperature:");
     // int temp = scanner.nextInt();
     
     /*
     if (temp>=30){
        System.out.println("It is hot outside");
    }else if (temp>=20 && temp<=30){
        System.out.println("It is Warm Outside");
    }else {
        System.out.println("It is Cold outside");
    }
    */


    System.out.println("You are playing a Game! Press q or Q to Quit!");
    String response = scanner.next();

    if (!response.equals("q") && !response.equals("Q")){
        System.out.println("You are Still Playing The Game!");
    }else {
        System.out.println("You Quit The Game !");
    }

    }
}
