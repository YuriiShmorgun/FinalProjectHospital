package model.entity;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.*;

public class ProcedureTest {



    Procedure procedure;



    ResourceBundle resourceBundleEn = ResourceBundle.getBundle("resource", new Locale("en", "US"));
    ResourceBundle resourceBundleUk = ResourceBundle.getBundle("resource", new Locale("uk", "UA"));




    @Test
    public void getSurname_uk() {
        procedure = new Procedure.Builder().setProcedure_en(resourceBundleUk.getString("TEST")).build();
        Assert.assertEquals(procedure.getProcedure_en(), (resourceBundleUk.getString("TEST")));
    }



}