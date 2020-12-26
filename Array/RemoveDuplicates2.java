package Array;

public class RemoveDuplicates2 {
    public static int removeDuplicates(int[] nums) {
        int index = 2;
        if(nums.length<=2){
            return nums.length;
        }
        else{
            for(int i=2; i<nums.length; i++){
                if(nums[i]!=nums[index-2]){
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,2,3,3,3,4,5};
        int len = removeDuplicates(nums);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}