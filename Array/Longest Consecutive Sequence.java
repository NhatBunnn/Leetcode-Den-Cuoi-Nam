import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int v : nums) set.add(v);

        int best = 0;

        for (int v : set) {
            // chỉ bắt đầu đếm nếu v là điểm bắt đầu của một dãy
            if (!set.contains(v - 1)) {
                int cur = v;
                int length = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    length++;
                }
                if (length > best) best = length;
            }
        }

        return best;
    }
}
