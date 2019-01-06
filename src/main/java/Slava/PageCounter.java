package Slava;

/**
 * Created by Murcielago on 05.12.2018.
 */
public class PageCounter {
    public static void main(String[] args) {
        System.out.println(pageCount(6,5));
    }
    static int pageCount(int n, int p) {
        int turnCount=0;
        if (n/2 <p){
            for (int i=n; i>n/2; i-=2){
                if(n%2!=0 && (i==p || i-1 ==p)){
                    return turnCount;
                }
                if(n%2==0 && (i==p || i+1 ==p)){
                    return turnCount;
                }
                turnCount++;
            }
        }
        else {
            for (int i=1; i<=n; i+=2){
                if(i==p || i-1 ==p){
                    return turnCount;
                }
                turnCount++;
            }

        }
        return turnCount;
    }
}
