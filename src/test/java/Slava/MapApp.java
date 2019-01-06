package Slava;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Murcielago on 17.12.2018.
 */
public class MapApp {
    static Map <Character,Integer> charMap = new HashMap<>();


    public static void main(String[] args) {
        countChars("chaaatanugalocobbzz");
        printMap();
    }

    public static void countChars(String word){
        for(int i =0; i< word.length();i++){
            if(charMap.containsKey(word.charAt(i))){
                Integer newValue = charMap.get(word.charAt(i)) +1;
                charMap.put(word.charAt(i),newValue);
            }
            else {
                charMap.put(word.charAt(i),1);
            }
        }
    }
    
    public static void printMap(){
        for (Character key:charMap.keySet()      ) {
            System.out.println(key + ": " + charMap.get(key));
        }
    }
}
