public class Removeduplicates {
    public static int[] findduplicates(int []nums){
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
    }
    return new int[j];
}

public static void main(String[] args) {
    int[] nums = {1, 2, 3, 3, 4, 4, 5};
    int[]  duplicates = Removeduplicates.findduplicates(nums);
    System.out.println(duplicates.length);
    
    }
   
    }
    




