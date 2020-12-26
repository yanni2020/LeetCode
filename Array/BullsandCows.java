package Array;
/**
 * #299. Bulls and Cows
 * 
 * You are playing the Bulls and Cows game with your friend.
 * You write down a secret number and ask your friend to guess what the number 
 * is. When your friend makes a guess, you provide a hint with the following 
 * info:
 * The number of "bulls", which are digits in the guess that are in the correct 
 * position. The number of "cows", which are digits in the guess that are in 
 * your secret number but are located in the wrong position. Specifically, the 
 * non-bull digits in the guess that could be rearranged such that they become 
 * bulls.Given the secret number secret and your friend's guess guess, return 
 * the hint for your friend's guess.
 */

public class BullsandCows {
    public static String getHint(String secret, String guess) {
        int[] secArr = new int[10];
        int[] gueArr = new int[10];
        int as = 0;
        int bs = 0;

        for(int i=0; i<guess.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)){
                as++;
            }
            else{
                secArr[((int)secret.charAt(i))-48]++;
                gueArr[((int)guess.charAt(i))-48]++;
            }
        }

        for(int i=0;i<secArr.length; i++){
            if(secArr[i]>gueArr[i]){
                bs += gueArr[i];
            }
            else{
                bs += secArr[i];
            }
        }
        return Integer.toString(as)+"A"+Integer.toString(bs)+"B";
    }


    public static void main(String[] args) {
        String secret = "1";
        String guess = "1";
        System.out.println(getHint(secret, guess));
    }
}
