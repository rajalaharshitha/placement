public class SecondMinimum {

    public static void main(String[] args) {
        double[] numbers = {12.5, 9.2, 4.5, 19.5, 2.5, 56.8}; 
        double min = Double.MAX_VALUE;
        double secondMin = Double.MAX_VALUE;

        for (double number : numbers) {
            if (number < min) {
                secondMin = min;
                min = number;
            } else if (number < secondMin && number != min) {  
                secondMin = number;
            }
        }

        System.out.println("Second minimum: " + secondMin);
    }
}
                                                                                                                                         
