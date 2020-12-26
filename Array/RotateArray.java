package Array;
/**
 * #189. Rotate Array
 * 
 * Given an array, rotate the array to the right by k steps, where k is 
 * non-negative.
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class RotateArray {

    public static void rotate(int[] nums, int k){
        int index;
        int[] arr = new int[nums.length];
        k %= nums.length;
        for(int i=0; i<nums.length; i++){
            index = i-k;
            if(index < 0){
                index += nums.length;
            }
            arr[i] = nums[index];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }

        //output check
        for(int l=0; l<nums.length; l++){
            System.out.print(nums[l]+", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] nums2 = new int[]{1,2,3,4,5,6,7};
        int k = 2;
        rotate(nums2, k);

    }
    
}
