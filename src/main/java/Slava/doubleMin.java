package Slava;

import java.util.ArrayList;

/**
 * Created by Murcielago on 06.12.2018.
 */
public class doubleMin {

    static ArrayList <Double> arrList = new ArrayList<>();
    static {
        arrList.add(5.0);
        arrList.add(5.1);

        arrList.add(3.5);
        arrList.add(68.41);
    }

    public static void main(String[] args) {
        System.out.println( getMin());
    }

    public static double getMin(){
        double min = arrList.get(0);
        int [] arr2= new int[5];

       for (int i =0;i <arrList.size(); i++){
           if(arrList.get(i)<min){
               min =arrList.get(i);
           }
       }
       return  min;
    }
}
