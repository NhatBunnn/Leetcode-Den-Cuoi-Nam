public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // copy dữ liệu sang hai mảng con
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // chia tiếp (đệ quy)
        mergeSort(left);
        mergeSort(right);

        // trộn 2 mảng đã sắp xếp
        merge(arr, left, right);
    }

    // hàm trộn — phần quan trọng nhất
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // index cho left
        int j = 0; // index cho right
        int k = 0; // index cho arr (kết quả)

        // so sánh từng phần tử và đưa phần nhỏ hơn vào arr
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // còn dư bên trái → đổ vào
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // còn dư bên phải → đổ vào
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

   
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 9, 1};

        mergeSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
