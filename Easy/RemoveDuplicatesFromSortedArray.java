public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicatesFromSortedArray(int [] nums ){
        int count =0;
        for(int i=0; i<nums.length; i++){
            if( i < nums.length-1 && nums[i] == nums[i+1]){
                continue;
            }
            else{
                nums[count]= nums[i];
                count++;
            }
           
        }
         return count;
    }
    public static void main(String[] args) {
        int nums []= {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicatesFromSortedArray(nums);
        System.out.println(removeDuplicatesFromSortedArray(nums));
        System.out.print("Updated array: ");
        for (int i = 0; i<length; i++) {
            System.out.print(nums[i] + " ");
    }
}
}