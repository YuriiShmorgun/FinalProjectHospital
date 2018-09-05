package model.entity;

import java.util.Locale;
import java.util.ResourceBundle;

public class DiagnosesInfo {
    private  int id;
    private String diagnoses_uk;
    private String diagnoses_en;
    private String name_uk;
    private String name_en;
    private String surname_uk;
    private String surname_en;



    public DiagnosesInfo(Builder builder) {
        this.id = builder.id;
        this.diagnoses_uk = builder.diagnoses_uk;
        this.diagnoses_en = builder.diagnoses_en;
        this.name_uk = builder.name_uk;
        this.name_en = builder.name_en;
        this.surname_uk = builder.surname_uk;
        this.surname_en = builder.surname_en;
    }

    public int getId() {
        return id;
    }

    public String getDiagnoses_uk() {
        return diagnoses_uk;
    }

    public String getDiagnoses_en() {
        return diagnoses_en;
    }

    public String getName_uk() {
        return name_uk;
    }

    public String getName_en() {
        return name_en;
    }

    public String getSurname_uk() {
        return surname_uk;
    }

    public String getSurname_en() {
        return surname_en;
    }


    @Override
    public String toString() {
        return "DiagnosesInfo{" +
                "id=" + id +
                ", diagnoses_uk='" + diagnoses_uk + '\'' +
                ", diagnoses_en='" + diagnoses_en + '\'' +
                ", name_uk='" + name_uk + '\'' +
                ", name_en='" + name_en + '\'' +
                ", surname_uk='" + surname_uk + '\'' +
                ", surname_en='" + surname_en + '\'' +
                '}';
    }

    public static class Builder{

        ResourceBundle resourceBundleEn = ResourceBundle.getBundle("resource", new Locale("en", "US"));
        ResourceBundle resourceBundleUk = ResourceBundle.getBundle("resource", new Locale("uk", "UA"));


        private  int id = 0;
        private String diagnoses_uk = resourceBundleUk.getString("DEFAULT");
        private String diagnoses_en = resourceBundleEn.getString("DEFAULT");
        private String name_uk = resourceBundleUk.getString("DEFAULT");
        private String name_en = resourceBundleEn.getString("DEFAULT");;
        private String surname_uk = resourceBundleUk.getString("DEFAULT");;
        private String surname_en = resourceBundleEn.getString("DEFAULT");;


        public Builder() {
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }
        public Builder setDiagnoses_uk(String procedure_uk) {
            this.diagnoses_uk = procedure_uk;
            return this;
        }

        public Builder setDiagnoses_en(String procedure_en) {
            this.diagnoses_en = procedure_en;
            return this;
        }

        public Builder setDoctorName_uk (String name_uk) {
            this.name_uk = name_uk;
            return this;
        }

        public Builder setDoctorName_en (String name_en) {
            this.name_en = name_en;
            return this;
        }

        public Builder setDoctorSurname_uk (String surname_uk) {
            this.surname_uk = surname_uk;
            return this;
        }

        public Builder setDoctorSurname_en (String surname_en) {
            this.surname_en = surname_en;
            return this;
        }


            
                public DiagnosesInfo build(){
                    return new DiagnosesInfo(this);
                }

    }
}

