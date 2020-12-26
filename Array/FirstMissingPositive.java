package Array;


/**
 * #41. First Missing Positive
 * 
 * Given an unsorted integer array nums, find the smallest missing positive 
 * integer.
 * 
 * Input: nums = [1,2,0]  Output: 3
 * Input: nums = [3,4,-1,1]  Output: 2
 * Input: nums = [7,8,9,11,12]  Output: 1
 */
public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
    if(nums.length == 0){
        return 1;
    }
    else{
        int[] arr = new int[nums.length];
        int num = -1;   
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0 && nums[i]<=nums.length){
                arr[nums[i]-1] = nums[i];
            }
        } 

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                num = i+1;
                break;
            }
            if(i==arr.length-1 && arr[i]!=0){
                num = i+2;
            }
        }

        if(num==-1){
            return 1;
        }
        else{
            return num;
        }


    }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,6,7,5};
        System.out.println(firstMissingPositive(nums));
    }
}
