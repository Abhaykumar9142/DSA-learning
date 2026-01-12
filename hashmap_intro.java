import java.util.HashMap;

public class hashmap_intro {
    public static void main(String[] args) {
        HashMap<String ,Integer>population=new HashMap<>();
        //add
        population.put("India",138);
        population.put("Australia",5);
        population.put("Canada",57);
        population.put("China",130);
        population.put("USA",48);

        //get
        System.out.println(population.get("India"));
        System.out.println(population.get("China"));

        //Check the presence of the key element
        System.out.println(population.containsKey("Kenya"));
        System.out.println(population.containsKey("Pakistan"));

        //Iteration on Hashmap
        for(String s:population.keySet()){
            System.out.println(s);
        }

        //Size of Hashmap
        System.out.println(population.size());

        //Remove from Hashmap
        population.remove("USA");
        System.out.println(population.containsKey("India"));

    }
}
