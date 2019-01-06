package Slava;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Murcielago on 06.12.2018.
 */
public class PhoneBook {
    static Map<String, String> book = new HashMap<String,String>();
    static {
        book.put("Slava", "+380");
        book.put("Anna", "+390");
    }

    public String getPhone(String name) {
        return book.get(name);
    }

    public void addPerson(String name, String phone){
        book.put(name,phone);
    }
    public boolean isPersonAvailable(String name){
        return book.containsKey(name);
    }
}
