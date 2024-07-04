public class TwoSumBruteForce {
    public static int[] findTwoSum(int[] nums, int target) {
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
        
        int[] result = findTwoSum(nums, target);
        
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
