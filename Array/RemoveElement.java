package Array;
/**
 * #27. Remove Element
 */

 /**
  * SOLUTION

  int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
  */

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        for(int i=0; i<length; i++){
            if(nums[i]==val){
                for(int j=i+1; j<length; j++){
                    nums[j-1] = nums[j];
                }
                length--;
                i--;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int length = removeElement(nums, val);
        System.out.println("length" + length);
        for(int i=0; i<length; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
