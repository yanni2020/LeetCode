package Array;

import java.util.Arrays;

/**
 * #217. Contains Duplicate
 * 
 * 
 * Given an array of integers, find if the array contains any duplicates.Your 
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean ifFind = false;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                ifFind = true;
                break;
            }
        }
        return ifFind;
    }
    

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}