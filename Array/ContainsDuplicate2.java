package Array;

/**
 * #219. Contains Duplicate II
 * 
 * Given an array of integers and an integer k, find out whether there are two 
 * distinct indices i and j in the array such that nums[i] = nums[j] and the 
 * absolute difference between i and j is at most k.
 */


 /**
  * HASH MAP
  *
  * HashMap<Integer,Integer> map  = new HashMap<>();
    
    for(int i  = 0 ; i<nums.length ; i++){
        
        if(map.containsKey(nums[i])){
            if( i - map.get(nums[i]) <= k ) return true;
        }
    
       map.put(nums[i],i);
    }
  */


public class ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean ifFind = false;
        
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j] && j-i <= k){
                    ifFind = true;
                    break;
                }
                if(j>=i+k){
                    break;
                }

            }
        }
        return ifFind;
    }



    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};

        System.out.println(containsNearbyDuplicate(nums, 2));
    }
}
