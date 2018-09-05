package model.entity;

import java.util.Locale;
import java.util.ResourceBundle;

public class Diagnoses {
    private  int id;
    private String diagnoses_uk;
    private String diagnoses_en;
    private int patient_id;
    private int doctor_id;



    public Diagnoses(Builder builder) {
        this.id = builder.id;
        this.diagnoses_uk = builder.diagnoses_uk;
        this.diagnoses_en = builder.diagnoses_en;
        this.patient_id = builder.patient_id;
        this.doctor_id = builder.doctor_id;
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

    public int getPatient_id() {
        return patient_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    @Override
    public String toString() {
        return "Diagnoses{" +
                "id=" + id +
                ", diagnoses_uk='" + diagnoses_uk + '\'' +
                ", diagnoses_en='" + diagnoses_en + '\'' +
                ", patient_id=" + patient_id +
                ", doctor_id=" + doctor_id +
                '}';
    }

    public static class Builder {

        ResourceBundle resourceBundleEn = ResourceBundle.getBundle("resource", new Locale("en", "US"));
        ResourceBundle resourceBundleUk = ResourceBundle.getBundle("resource", new Locale("uk", "UA"));


        private  int id = 0;
        private String diagnoses_uk = resourceBundleUk.getString("DEFAULT");
        private String diagnoses_en = resourceBundleEn.getString("DEFAULT");
        private int patient_id = 0;
        private int doctor_id = 0;


        public Builder() {
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }
        public Builder setProcedure_uk(String procedure_uk) {
            this.diagnoses_uk = procedure_uk;
            return this;
        }

        public Builder setProcedure_en(String procedure_en) {
            this.diagnoses_en = procedure_en;
            return this;
        }

        public Builder setPatient_id(int patient_id) {
            this.patient_id = patient_id;
            return this;
        }

        public Builder setDoctor_id (int doctor_id) {
            this.doctor_id = doctor_id;
            return this;
        }

        public Diagnoses build(){
            return new Diagnoses(this);
        }

    }

}
