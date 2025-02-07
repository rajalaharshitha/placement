public class FirstDuplicate{

    public static void main(String[] args) {
        int[] numbers = {12, 9, 5, 8, 4, 5, 10};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("First duplicate: " + numbers[i]);
                    return;
                }
            }
        }

        System.out.println("No duplicates found.");
    }
}