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
        //    for map.get function if the key is already exits print the value  if doesn't exost print null.
        System.out.println(map.get("bat")); //key is already present. value
        System.out.println(map.get("shoes"));//key is not present.     Null


        // new type of for loop-- for(val:collection){print(val)}.
        // int[] arr={1,2,3,4,5,6,7};
        // for(int val : arr){
        //     System.out.println(val+" ");
        // }

        // Iteration in hashmap.
        // for (int val :arr)   int-->Map.Entry<String,Integer>  value-->entry   arr-->map.entryset()
        // for(Map.Entry<String, Integer> entry : map.entrySet())
       
        for(Map.Entry<String,Integer> e : map. entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

    }
}
     

