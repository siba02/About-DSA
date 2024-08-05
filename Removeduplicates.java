//? Remove duplicates from a sorted array.(Easy 57%  No-26).
public class Removeduplicates {
    public static int[] findduplicates(int []nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                ++j;
                nums[j]=nums[i];
                
            }
    }
    // create an array to store new elementts.
    int[] newnums = new int[j + 1];
        for (int k = 0; k <= j; k++) {
            newnums[k] = nums[k];
        }

        return newnums;
}

public static void main(String[] args) {
    int[] nums = {1, 2, 3, 3, 4, 4, 5};
    int[]  duplicates = Removeduplicates.findduplicates(nums);
    System.out.println(duplicates.length);
    for (int num : duplicates) {
        System.out.print(num + " ");
        
    }
        }
   
    }
    

    




