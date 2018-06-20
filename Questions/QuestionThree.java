public class QuestionThree {

    // given an amount of money and an array of coin denominations, method returns the number
    // of ways to make that amount of money using the coin denominations available
    // ex: amount = 4, coinDenominations=[1,2,3], method returns 4 possibilities
    // which consist of 1, 1, 1, 1 and 1, 1, 2, and 1, 3, and 2, 2
    public static int changePossibilities(int amount, int[] coinDenominations) {
        // set up combinations array
        // each element correlates to an amount of money
        int[] combinations = new int[amount+1];
        combinations[0] = 1;
        // iterate through combinations array for each coin denomiation
        for (int i = 0; i < coinDenominations.length; i++) {
            int coin = coinDenominations[i];
            for (int j = 1; j < combinations.length; j++) {  
                if (j >= coin) {
                    combinations[j] = combinations[j] + combinations[j-coin];
                }
            }
        }
       return combinations[amount]; 
    }

    public static void main (String[] args) {
        if (args.length < 1) return;
        // assuming first arg represents an integer amount
        int amount = Integer.parseInt(args[0]);
        // assumming subsequent args represent an integer coin denominations
        int[] coinDenominations = new int[args.length - 1];
        for (int argsPointer = 1, coinsPointer = 0; argsPointer < args.length; argsPointer++, coinsPointer++) {
            coinDenominations[coinsPointer] = Integer.parseInt(args[argsPointer]);
        }
        System.out.println(changePossibilities(amount, coinDenominations));
    }
}
