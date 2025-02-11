import java.util.Arrays;
public class NextGreaterElement {
    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int currentPrice = arr[i];
            int nextGreater = -1;
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] > currentPrice) {
                    nextGreater = arr[j];
                    break;
                }
            }
            result[i] = nextGreater;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {6, 8, 0, 1, 3};
        int[] arr2 = {1, 3, 2, 4};
        int[] arr3 = {10, 20, 30, 50};
        int[] arr4 = {50, 40, 30, 10};
        System.out.println("Input: " + Arrays.toString(arr1) + ", Output: " + Arrays.toString(findNextGreaterElements(arr1)));
        System.out.println("Input: " + Arrays.toString(arr2) + ", Output: " + Arrays.toString(findNextGreaterElements(arr2)));
        System.out.println("Input: " + Arrays.toString(arr3) + ", Output: " + Arrays.toString(findNextGreaterElements(arr3)));
        System.out.println("Input: " + Arrays.toString(arr4) + ", Output: " + Arrays.toString(findNextGreaterElements(arr4)));


    }
}