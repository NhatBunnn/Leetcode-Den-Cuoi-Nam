
class Main {
    public static void main(String[] args) {
        int[] numbers = { 3, 5, 2, 9, 7 };
        int target = 9;
        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Found: " + index);
        } else {
            System.out.println("Not found");
        }
    }

    public static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}