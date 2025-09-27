
class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15 };
        int target = 11;
        int index = jumpSearch(arr, target);
        if (index != -1) {
            System.out.println("Found: " + index);
        } else {
            System.out.println("Not found");
        }
    }

    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int prev = 0;
        int step = (int) Math.floor(Math.sqrt(n));

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        // linear search (bài trước)
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }
}