public class CoinChange {
    public static void main(String[]args){
        int[] coins = {1,2,5};
        int amount = 11;
        int result = minCoins(coins, amount);
        if(result == Integer.MAX_VALUE){
            System.out.println("It's not possible to make the amount with the the given coins,");
        }else{
            System.out.println("Minimum coins required:"+result);
        }
    }
    public static int minCoins(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        for(int i = 1; i<=amount; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i = 1; i <= amount; i++){
            for(int coin : coins){
                if(i - coin >=0){
                    dp[i] = Math.min(dp[i], dp[i - coin] +1);
                }
            }
        }
        return dp[amount];
    }
    
}
