class Solution {

    // video giải: https://www.youtube.com/watch?v=fhchHuIKqrI

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // prefix + suffix mặc định là 1 do tính trung lập của 1
        // kiểu như là nhân gì với 1 cũng ko bị ảnh hưởng

        // prefix
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        // suffix
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }

}