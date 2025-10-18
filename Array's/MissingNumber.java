public class MissingNumber {
    public static int MissingNumber(int nums[]){
        int sum=0;
        for(int i =0; i<nums.length;i++){
            sum = sum+nums[i];
        }
        int actualSum= (nums.length*(nums.length+1))/2;
        int MissingNo=actualSum -sum;
        return MissingNo;
    }
    public static void main(String[] args) {
        int nums [] ={9,6,4,2,3,5,7,0,1};
        System.out.println(MissingNumber(nums));
    }
}
