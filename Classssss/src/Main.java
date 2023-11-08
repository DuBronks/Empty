import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");

        String animal = (String)animals.get(0);
        System.out.println(animal);



        List<String> animals2 = new ArrayList<>();
        animals2.add("Cat");
        animals2.add("Dog");

        String animal2 = animals2.get(1);


    }
}