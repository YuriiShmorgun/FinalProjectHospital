package model.entity;

import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

public class Procedure {


    private int id;
    private String procedure_uk;
    private String procedure_en;
    private Type type;



    public Procedure(Builder builder) {
        this.id = builder.id;
        this.procedure_uk = builder.procedure_uk;
        this.procedure_en = builder.procedure_en;
        this.type = builder.type;
    }

    public int getId() {
        return id;
    }

    public String getProcedure_uk() {
        return procedure_uk;
    }

    public String getProcedure_en() {
        return procedure_en;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Procedure procedure = (Procedure) o;
        return Objects.equals(procedure_uk, procedure.procedure_uk) &&
                Objects.equals(procedure_en, procedure.procedure_en) &&
                type == procedure.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(procedure_uk, procedure_en, type);
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "id=" + id +
                ", procedure_uk='" + procedure_uk + '\'' +
                ", procedure_en='" + procedure_en + '\'' +
                ", type=" + type +
                '}';
    }

    public static class Builder{

        ResourceBundle resourceBundleEn = ResourceBundle.getBundle("resource", new Locale("en", "US"));
        ResourceBundle resourceBundleUk = ResourceBundle.getBundle("resource", new Locale("uk", "UA"));


        private int id = 0;
        private String procedure_uk = resourceBundleEn.getString("DEFAULT");;
        private String procedure_en = resourceBundleUk.getString("DEFAULT");;
        private Type type = null;


        public Builder() {
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setProcedure_uk(String procedure_uk) {
            this.procedure_uk = procedure_uk;
            return this;
        }

        public Builder setProcedure_en(String procedure_en) {
            this.procedure_en = procedure_en;
            return this;
        }

        public Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public Procedure build(){
            return new Procedure(this);
        }

    }
}

