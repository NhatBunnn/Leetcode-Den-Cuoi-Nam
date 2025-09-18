/*
Idea:
- Giống hệt bài 3sum =)) 
Note:
- Nếu wrong answer mà báo lỗi do số lớn quá thì nghĩ luôn đến ép kiểu sang longgg~~~
*/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-3; i++){
            if( i > 0 && nums[i] == nums[i-1]) continue;

            for(int j=i+1; j<nums.length-2; j++){
                if( j > i+1 && nums[j] == nums[j-1] ) continue;

                int left = j + 1;
                int right = nums.length - 1;

                while(left < right){
                    long total = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if( total == target ) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right-1]) right--;

                        left++;
                        right--;
                    }else if(total < target){
                        left++;
                    }else{
                        right--;
                    }

                }
            }
        } 
        return result; 
    }
}