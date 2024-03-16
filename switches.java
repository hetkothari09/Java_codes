import java.util.Scanner;

class switches {

    public static void main (String [] args){

        // switch = statement that allows a variable to be tested for equality against a list of values
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day : ");
        String day = scanner.next();

        switch(day){
            case "Sunday":
                System.out.println("Its a Sunday Today!");
                break;

            case "Monday":
                System.out.println("Its a Monday Today!");
                break;

            case "Tuesday":
                System.out.println("Its a Tuesday Today!");
                break;

            case "Wednesday":
                System.out.println("Its a Wedenesday Today!");

            case "Thursday":
                System.out.println("Its a Thursday Today!");
                break;

            case "Friday":
                System.out.println("Its a Friday Today!");
                break;

            case "Saturday":
                System.out.println("Its a Saturday Today!");
                break;

            default:
                System.out.println("Invalid day -_- ");
                break;

        }



    }
}
