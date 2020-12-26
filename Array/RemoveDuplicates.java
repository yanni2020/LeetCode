package Array;
/**
 * #26. Remove Duplicates from Sorted Array
 */

 /**
  * SOLUTION
  *
  * if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
  */


public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length == 0){
            return 0;
        }
        else{
            int[] arr = new int[length];
            int index = 1;
            arr[0] = nums[0];
            for(int i=1; i<length; i++){
                if(nums[i-1]!=nums[i]){
                    arr[index] = nums[i];
                    index++;
                }
            }
            for(int i=0; i<index; i++){
                nums[i] = arr[i];
            }
            return index;
        }  
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int size = removeDuplicates(nums);
        System.out.println(size);

        for(int i=0; i<size; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
