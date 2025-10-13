public class FrequencyOfEachElement {
    public static void FrequencyOfEachElement(int arr []){
        for(int i =0; i<arr.length; i++){
            int x= arr[i];
            int count=0;
            if (x ==-1) continue;

            for(int j=0; j<arr.length;j++){
                if(arr[j] == x){
                    count++;
                    arr[j]=-1;
                    
                    
                }
            }
            System.out.println("Frequency of " + x + " = " + count);
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,5,6,6,6,6,6,7,8,8,8,9};
        FrequencyOfEachElement(arr);
        
    }
}
