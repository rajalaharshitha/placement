public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            int rightSum = 0;
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 10, 10, 30, 20, 10, 10};
        int equilibriumIndex = findEquilibriumIndex(arr);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
        int[] arr2 = {-7, 1, 5, 2, -4, 3, 0};
        int equilibriumIndex2 = findEquilibriumIndex(arr2);
        if (equilibriumIndex2 != -1) {
            System.out.println("Equilibrium index: " + equilibriumIndex2);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}