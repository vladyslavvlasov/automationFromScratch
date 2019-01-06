package Slava;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Murcielago on 06.12.2018.
 */
public class PhoneBookTest {
    PhoneBook phoneBook =new PhoneBook();
    String expectedPhone = "+380";
    String expectedName = "Slava";
    String personName="Josh";
    String personPhone = "080090";

    @Test
    public void getPhoneByName(){
        String phone = phoneBook.getPhone(expectedName);
        Assert.assertEquals(phone, expectedPhone);
    }

    @Test
    public void addPerson(){
        phoneBook.addPerson(personName, personPhone);
        Assert.assertTrue(phoneBook.isPersonAvailable(personName));
        Assert.assertEquals(phoneBook.getPhone(personName), personPhone);
    }
}
