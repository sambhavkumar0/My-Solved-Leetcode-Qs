//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
import java.util.Scanner;
class Q3 {
    public static int removeDuplicates(int[] nums) {
        
       int i = 0;
    for (int n : nums)
        if (i == 0 || n > nums[i-1])
            nums[i++] = n;
    return i;
}
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array :");
        int l=sc.nextInt();
        System.out.println("enter elements:");
        int []arr=new int[l];
        for(int i=0; i<l; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("array before deleting dups");

        for(int i=0; i<l; i++){
            System.out.print(arr[i]+" ,");
        }
        System.out.println("total number of unique elements are:");
        int r=removeDuplicates(arr);
        System.out.println(r);
        sc.close();

   }

}

