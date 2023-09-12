//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

//Merge nums1 and nums2 into a single array sorted in non-decreasing order.

//Merge Sort Array
import java.util.*;
class Q1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0,i=m;j<n;j++){
            nums1[i]=nums2[j];
            i++;

        }
        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }

        
    }

    public static void main(String[] args) {
        //for this program we used the same 1st array as merge array thats why we add the zeros
        int []nums1 ={1,2,3,4,5,6,0,0,0,0};
        int []nums2 ={10,20,30,40};
        int m=6;
        int n=nums2.length;
        merge(nums1,m,nums2,n);

    }
}

