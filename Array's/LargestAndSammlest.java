public class LargestAndSammlest {
    public static void main(String[] args) {
        int arr [] = {10,5,20,8,10,2,20,1};
        int largest = arr[0];
        int smallest = arr[0];
        for(int i =1; i<arr.length;i++){
            if (arr[i] > largest) {
                largest= arr[i];
                
            }
            if (arr[i]< smallest) {
                smallest =arr[i];
                
            }

        }
        System.out.println("Largest element is "+largest);
        System.out.println("Smallest element is "+smallest);

    }
}
