public class Debit{

    public static void main(String[] args) {
        String[] transactions = {"900", "1500", "600", "1200", "400"};
        String[] debitAmounts = {"600", "400"};

        int debitCount = 0;

        for (String transaction : transactions) {
            for (String debitAmount : debitAmounts) {
                if (transaction.equals(debitAmount)) {
                    debitCount++;
                    break; 
                }
            }
        }

        System.out.println("Number of debits: " + debitCount);
    }
}