// ? Twosum by Brute Force method(Easy 53%).

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {      // parameterised static method.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        
        // If no solution is found, return an empty array or throw an exception
        return new int[] {} ;
    }

    public static void main(String[] args) {
        int[] nums = {11, 2, 6, 15,7,23,84};
        int target = 9;
        
        int[] result = findTwoSum(nums, target);     // static method canbe  called without creating object. 
        
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
