public class LinearSearchRecursive {
    public static int linearSearchRecursive(double[] arr, double element, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == element) {
            return index;
        }
        return linearSearchRecursive(arr, element, index + 1);
    }
    public static void main(String[] args) {
        double[] arr = {2.5, 9.2, 4.5, 19.5, 2.5, 56.8};
        double element = 19.5;
        int result = linearSearchRecursive(arr, element, 0);
        if (result != -1) {
            System.out.println("Element " + element + " found at index " + result);
        } else {
            System.out.println("Element " + element + " not found in the array.");
        }
    }
}