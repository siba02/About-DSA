class Removelement {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
                
            }
        }
    return j ;
}
public static void main(String[] args) {
    int [] nums={3,2,2,2,4,3};
    int val=2;
    int result=Removelement.removeElement(nums,val);
    System.out.print(result);
    }
}
