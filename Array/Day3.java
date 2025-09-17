// [16. 3Sum Closest]
// https://leetcode.com/problems/3sum-closest/?envType=problem-list-v2&envId=array

/*
Ideas:
- Giống bài 3sum 
- Ý chính:
+ Thêm biến cloeset để xác định tổng gần target nhất
+ kiếm tra tổng gần target nhất bằng trị tuyệt đối của tổng(hiện tại) - target(cũ)
                                                    -> nếu tổng hiện tại nhỏ ... lười viết:))
*/ 

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int total = nums[i] + nums[left] + nums[right];

                if(total == target){
                    return total;
                } 

                if(Math.abs(total - target) < Math.abs(closest - target)){
                    closest = total;
                }

                if(total < target){
                    left++;
                }else{
                    right--;
                }
            }  
        }
        return closest;
    }
}