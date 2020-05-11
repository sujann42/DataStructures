public class BinarySearch {
    public static int findNumUsingBinarySearch(int[] listOfNumbers, int num) {
        int l = 0;
        int h = listOfNumbers.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            int midNum = listOfNumbers[mid];
            System.out.println(l + " " + h + " divided by 2 = " + mid);
            if (midNum == num) {
                return mid;
            }
            if (num < listOfNumbers[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] listOfNumbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91, 101};
        int num = 72;
        int index = findNumUsingBinarySearch(listOfNumbers, num);
        System.out.println(index);
    }
}
