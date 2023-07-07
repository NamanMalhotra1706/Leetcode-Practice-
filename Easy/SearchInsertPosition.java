public class SearchInsertPosition {

    // Using Binary Search Approach for O(log n) time complexity
    public static int searchInsert(int[] nums, int target) {
        
        if(target < nums[0]){
            return 0;
        }
        else if(target > nums[nums.length-1]){
            return nums.length;
        }
        
        int start=0 , end = nums.length-1 , mid = -1 , index=0;


        while(start<=end){
            mid = (end+start)/2;

            if(nums[mid] > target){
                index = mid;
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target = 5;

        System.out.println(searchInsert(nums,target));
    }
}
