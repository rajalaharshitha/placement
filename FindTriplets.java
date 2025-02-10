import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class FindTriplets {
    private static long[] temp;
    public static void main(String[] args) {
        int[] input = {2, 3, 1, 4, 6, 1, 4, 1};
        int target = 6;
        Set<String> uniqueTriplets = findUniqueTriplets(input, target);
        System.out.println(uniqueTriplets);
    }
    public static Set<String> findUniqueTriplets(int[] arr, int target) {
        int n = arr.length;
        Set<String> triplets = new HashSet<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        int[] temp = {arr[i], arr[j], arr[k]};
                        Arrays.sort(temp);
                        String tripletStr = Arrays.toString(temp);
                        triplets.add(tripletStr);
                    }
                }
            }
        }
        return triplets;
    }
}