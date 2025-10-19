class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while( left <= right ){
            int mid = (left + right)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                 left = mid + 1; // -> mid đã dùng rồi nên mid + 1 để tránh dùng lại OK!
            }else{ // (nums[mid] > target)
                 right = mid - 1; 
            }
        }
        return -1;
    }
}