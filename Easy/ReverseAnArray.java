public class ReverseAnArray {

    public static void reverseAnArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        
        reverseAnArray(arr);

        System.out.println("\nReversed Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
