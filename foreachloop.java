 import java.util.ArrayList;

 class foreachloop {
    public static void main(String[] args) {
        
    // for-each loop = traversing technique to iterate through the elements in an array/collection
    //                 less steps, more Readable
    //                 less flexible

    //    String[] animals = {"cat","dog","bird"};

    ArrayList<String> animals = new ArrayList<String>();
    
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Rat");
    animals.add("Bird");
        for(String i : animals) {
            System.out.println(i);
        }


    }
}
