class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing number: " + missingNumber);
        int[] arr2 = {1, 2, 4, 5, 6};
        int missingNumber2 = findMissingNumber(arr2);
        System.out.println("Missing number: " + missingNumber2);
        int[] arr3 = {2, 3, 4, 5};
        int missingNumber3 = findMissingNumber(arr3);
        System.out.println("Missing number: " + missingNumber3);
    }
}