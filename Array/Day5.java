// [26. Remove Duplicates from Sorted Array]
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=problem-list-v2&envId=array

class Solution {
    public int removeDuplicates(int[] nums) {
        /*
        Idea:
        - Mục tiêu là biến "temp" sẽ luôn đúng ở vị trí thứ 2 trong 1 dãy trùng lặp để
        để khi so sánh số phía sau với số phía trước ( là số hiện tại hay temp--)
        - ....DCM T LƯỜI VIẾT!
        */

        if( nums.length <= 1 ) return nums.length;

        int temp = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[temp-1]){
                nums[temp] = nums[i];
                temp++;
            }
        }
        return temp;
    }
}