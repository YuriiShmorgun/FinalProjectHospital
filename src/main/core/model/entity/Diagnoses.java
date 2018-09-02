package model.entity;

import java.util.Locale;
import java.util.ResourceBundle;

public class Diagnoses {
    private String diagnoses_uk;
    private String diagnoses_en;


    public Diagnoses(Builder builder) {
        this.diagnoses_uk = builder.diagnoses_uk;
        this.diagnoses_en = builder.diagnoses_en;
    }

    public String getDiagnoses_uk() {
        return diagnoses_uk;
    }

    public String getDiagnoses_en() {
        return diagnoses_en;
    }


    @Override
    public String toString() {
        return "Diagnoses{" +
                "diagnoses_uk='" + diagnoses_uk + '\'' +
                ", diagnoses_en='" + diagnoses_en + '\'' +
                '}';
    }

    public static class Builder {

        ResourceBundle resourceBundleEn = ResourceBundle.getBundle("resource", new Locale("en", "US"));
        ResourceBundle resourceBundleUk = ResourceBundle.getBundle("resource", new Locale("uk", "UA"));



        private String diagnoses_uk = resourceBundleUk.getString("DEFAULT");;
        private String diagnoses_en = resourceBundleEn.getString("DEFAULT");;


        public Builder() {
        }


        public Builder setProcedure_uk(String procedure_uk) {
            this.diagnoses_uk = procedure_uk;
            return this;
        }

        public Builder setProcedure_en(String procedure_en) {
            this.diagnoses_en = procedure_en;
            return this;
        }

        public Diagnoses build(){
            return new Diagnoses(this);
        }

    }

}
