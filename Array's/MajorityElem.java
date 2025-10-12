public class MajorityElem {
    public static int majorityElement(int nums []){
        int cand =0;
        int point =0;
        for(int i=0; i<nums.length; i++){
            if(point == 0){
                cand= nums[i];

            }
            if(cand == nums[i]){
                point++;
            }
            else{
                point--;
            }
        }
        return cand;
    }
    public static void main(String[] args) {
        int nums[] ={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}

// sloving this problem usnig Moore's Voting algorithm.