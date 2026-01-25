public class RemoveDup {
    public static int RemoveDuplicate(int[] nums){
        int j=1;
        for(int i =1; i<nums.length;i++){
            if (nums[i] != nums[j-1]) {
                 nums[j] = nums[i];
                j++;
                
            }
            
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        int k = RemoveDuplicate(nums);
        System.out.println(k);
    }
}
