package Slava;

import java.util.ArrayList;

/**
 * Created by Murcielago on 04.12.2018.
 */
public class TestClass {

    public static void main(String[] args) {
        int [] arr = {1,2,1};
        System.out.println(sockMerchant(3,arr ));
    }

    static int sockMerchant(int n, int[] ar) {
        ArrayList<Integer> skipNums =new ArrayList();
        int pairCount =0;
        for (int i =0; i<n;i++){
            for (int j=n-1;j>i;j--){
                if(ar[j]==ar[i] && skipNums.indexOf(j)==-1){
                    skipNums.add(i);
                    skipNums.add(j);
                    System.out.println("here");
                    pairCount++;
                }
            }
        }
        return pairCount;
    }
}
