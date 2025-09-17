//  [15. 3Sum]
// https://leetcode.com/problems/3sum/?envType=problem-list-v2&envId=array

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /* 
        Input: nums = [-1,0,1,2,-1,-4]
        Output: [[-1,-1,2],[-1,0,1]]

        Idea:
        - Trước tiên sắp xếp mảng để sử dụng con trỏ (left và right).
        - Tìm các bộ ba phần tử trong mảng: [nums[i], nums[left], nums[right]].
        - Vòng lặp ngoài duyệt phần tử đầu tiên nums[i].
        - Bên trong, dùng hai con trỏ left (i+1) và right (cuối mảng) 
        để tìm các cặp còn lại sao cho tổng = 0.
        - Khi tổng = 0, thêm bộ ba vào kết quả và bỏ qua các phần tử trùng lặp:
            + Nếu nums[left] == nums[left+1] tăng left lên.
            + Nếu nums[right] == nums[right-1] giảm right xuống.
        - Cứ lặp cho tới khi left >= right, sau đó chuyển sang i tiếp theo. 
        */

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            if( i>0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length-1;
            
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    if( left < right && nums[left] == nums[left+1] ) left++;
                    if( left < right && nums[right] == nums[right-1]) right++;

                    //Tiến cả 2 vì: 2 con trỏ đã được loại bỏ trùng lặp tổng == 0 nên chỉ tiến 1 trong 2 chắc chắn !=0 
                    left++;
                    right--;

                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }

        }        
    return result;
    }
}
