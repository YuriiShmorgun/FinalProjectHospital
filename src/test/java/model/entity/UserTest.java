package model.entity;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.*;

public class UserTest {



    ResourceBundle resourceBundleEn = ResourceBundle.getBundle("resource", new Locale("en", "US"));
    ResourceBundle resourceBundleUk = ResourceBundle.getBundle("resource", new Locale("uk", "UA"));

    User user;



    @Test
    public void TestDefolt() {
        user = new User.Builder().build();
        if (
            (!user.getRole().equals(Role.GUEST)) &&
            (!user.getName_en().equals(resourceBundleEn.containsKey("GUEST"))) &&
            (!user.getName_uk().equals(resourceBundleUk.containsKey("GUEST")))
                ) Assert.fail();
    }



    @Test
    public void getId() {
        user = new User.Builder().setLogin(resourceBundleEn.getString("TEST")).build();
        user.getLogin();
    }

    @Test
    public void getLogin() {
    }

    @Test
    public void getPassword() {
    }

    @Test
    public void getName_uk() {
    }

    @Test
    public void getName_en() {
    }

    @Test
    public void getSurname_uk() {
    }

    @Test
    public void getSurname_en() {
    }

    @Test
    public void getRole() {
    }
}