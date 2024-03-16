//package constructorsnew.java;

 class main {
   public static void main(String [] args){

       Human human = new Human("Het",188,70);

       System.out.println(human.name);

   }
    
   class Human {

    String name;
    int age;
    double weight;


    Human (String name, int age, double weight) {
        
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    }

    }