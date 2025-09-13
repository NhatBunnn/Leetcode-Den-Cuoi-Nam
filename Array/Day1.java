//  [11. Container With Most Water]
//  https://leetcode.com/problems/container-with-most-water/?envType=problem-list-v2&envId=array

class Solution {
    public int maxArea(int[] height) {
        /*
        Idea:
        - Sử dụng 2 con trỏ left và right
        - Tạo biến maxArea để lưu diện tích (area) lớn nhất
        - left++ và right-- cho đến khi gặp nhau 
        (cái nào thấp nhất thì tiền trước vì thấp tiền lên mới tăng diện tích được)
        - Chiều cao sẽ là độ cao thấp nhất trong left hoặc right (để nước ko bị tràn ra ngoài)
        - Chiều rộng right - left
        - Mỗi vòng lặp kiểm tra xem diện tích hiện tại có lớn hơn diện tích cũ ko (có thì update)
        */

        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        while (left < right){
            int h = height[left] < height[right] ? height[left] : height[right];
            int w = right - left;

            if(maxArea < h * w) {
                maxArea = h * w;
            }

            if(left < right){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}