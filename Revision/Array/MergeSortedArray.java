package Array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void MergeSortedArray(int [] nums1, int [] nums2, int m , int n ){
        int  i =n-1;
        int j =m-1;
        int k =n+m-1;
        while (j>= 0 && i>=0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--; 
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
            
        }
    }
public static void main(String[] args) {
    int [] nums1 = {1,2,3,4,0,0,0};
    int [] nums2 = {8,9,4};
    int m=4;
    int n =3;
    MergeSortedArray(nums1, nums2,m,n);
        System.out.println(Arrays.toString(nums1));
}
}
