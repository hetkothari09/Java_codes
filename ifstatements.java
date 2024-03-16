import java.util.Scanner;

class ifstatements {
    public static void main (String[] args ){
        
        Scanner scanner = new Scanner(System.in);
        // int age = 18;
        System.out.println("Enter Your age: ");
        int age = scanner.nextInt();

        if (age>=75){
            System.out.println("Ok Boomer!");
        }else if (age>=18){
            System.out.println("You are an Adult!");
        }else if (age>=13){
            System.out.println("You are a Teenager!!");
        }else {
            System.out.println("You are a kid ");
        }
    }
    
}
