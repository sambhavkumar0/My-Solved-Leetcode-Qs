//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

//Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

//Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not //important as well as the size of nums.
//Return k.

public class Remove_val {
    public static void main(String[] args) {
        int[] nums ={3,2,2,3}; // Input array
        int val =3; // Value to remove
        int[] expectedNums = {2,2,0,0}; // The expected answer with correct length.
                                    // It is sorted with no values equaling val.
        
        int k = removeElement(nums, val); // Calls your implementation
        System.out.println(k);
        for (int i = 0; i<k; i++) {
            System.out.print(nums[i]);
            }
       

    }
    public static int removeElement(int[] nums, int val) {
        int i=0;
    
           for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
           
            
        }
       
         return i;
    }
}

