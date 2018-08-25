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
    public void TestDefault() {
        user = new User.Builder().build();
        if (
            (!user.getRole().equals(Role.GUEST)) &&
            (!user.getName_en().equals(resourceBundleEn.containsKey("GUEST"))) &&
            (!user.getName_uk().equals(resourceBundleUk.containsKey("GUEST")))
                ) Assert.fail();
    }

    @Test
    public void getLogin() {
        user = new User.Builder().setLogin(resourceBundleEn.getString("TEST")).build();
        Assert.assertEquals(user.getLogin(), (resourceBundleEn.getString("TEST")));
    }

   @Test
    public void getPassword() {
        user = new User.Builder().setPassword(resourceBundleEn.getString("TEST")).build();
        Assert.assertEquals(user.getPassword(), (resourceBundleEn.getString("TEST")));
    }

    @Test
    public void getName_uk() {
        user = new User.Builder().setName_uk(resourceBundleUk.getString("TEST")).build();
        Assert.assertEquals(user.getName_uk(), (resourceBundleUk.getString("TEST")));
    }

    @Test
    public void getName_en() {
        user = new User.Builder().setName_uk(resourceBundleEn.getString("TEST")).build();
        Assert.assertEquals(user.getName_uk(), (resourceBundleEn.getString("TEST")));
    }

    @Test
    public void getSurname_uk() {
        user = new User.Builder().setSurname_uk(resourceBundleUk.getString("TEST")).build();
        Assert.assertEquals(user.getSurname_uk(), (resourceBundleUk.getString("TEST")));
    }

    @Test
    public void getSurname_en() {
        user = new User.Builder().setSurname_en(resourceBundleEn.getString("TEST")).build();
        Assert.assertEquals(user.getSurname_en(), (resourceBundleEn.getString("TEST")));
    }

    @Test
    public void getRole() {
        user = new User.Builder().setRole(Role.ADMINISTRATOR).build();
        Assert.assertEquals(user.getRole(), (Role.ADMINISTRATOR));
    }
}