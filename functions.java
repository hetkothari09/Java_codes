class functions {
    public static void main(String[] args) {
        
        // method = a block of code that is executed whenever it is called upon
      
/*
        String name = "Het";
        int age = 21;

        hello(name,age);
*/



        int x = 3;
        int y = 4;

       int z = add(x,y);
    //   System.out.println(z);
       System.out.println(add(x,y));
    }
    
/*
   static void hello(String title, int age){
        System.out.println();
        System.out.println("Hello "+title);
        System.out.println("You are "+age+" years old.");
        System.out.println();
    }
*/

    static int add(int x, int y){

     //   int z = x+y;
      //  return z;

      return x+y;
    }

}
