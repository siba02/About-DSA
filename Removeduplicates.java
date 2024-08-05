public class Removeduplicates {
    public static int[] findduplicates(int []nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                ++j;
                nums[j]=nums[i];
                
            }
    }
    
    return new int [j+1];
}

public static void main(String[] args) {
    int[] nums = {1, 2, 3, 3, 4, 4, 5};
    int[]  duplicates = Removeduplicates.findduplicates(nums);
    System.out.println(duplicates.length);
    
    
        }
   
    }
    




