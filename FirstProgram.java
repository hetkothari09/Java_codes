import java.util.Scanner;
class FirstProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is Your name: ");
        String firstname = input.next();

        System.out.print("What is Your last name : ");
       String lastname = input.next();

       System.out.print("What is Your age :");
       int age = input.nextInt();

        System.out.print("what is Your favourite Food :");
        String food = input.next();

        System.out.println("Your Full name is "+firstname+" "+lastname);
        System.out.println("You are "+age+" years old");
        System.out.println("Your Favourite Food is "+food);

         }
}