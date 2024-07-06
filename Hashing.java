import java.util.*;

public class Hashing {
    public static void main(String[] args){
        // key , value
        HashMap<String, Integer> map = new HashMap<>();

        // insertion 
        map.put("bat",2500);
        map.put("ball",70);
        map.put("wicket",800);
        map.put("pad",1800);

    System.out.println(map);
    // map.put("helmet",3200);  if key is already exist  update the key ,if doesn't exist insert a new pair.
    // System.out.println(map);

    // search.
     if(map.containsKey("wicket")){
         System.out.println("present in the map"); 
        }else{
            System.out.println("not present in the map");
        }
    }
}
    

