package model.entity;

import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

public class User {

    private int id;
    private String login;
    private String password;
    private String name_uk;
    private String name_en;
    private String surname_uk;
    private String surname_en;
    private Role role;

    private User(Builder builder) {
        this.id = builder.id;
        this.login = builder.login;
        this.password = builder.password;
        this.name_uk = builder.name_uk;
        this.name_en = builder.name_en;
        this.surname_uk = builder.surname_uk;
        this.surname_en = builder.surname_en;
        this.role = builder.role;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
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

    public Role getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(name_uk, user.name_uk) &&
                Objects.equals(name_en, user.name_en) &&
                Objects.equals(surname_uk, user.surname_uk) &&
                Objects.equals(surname_en, user.surname_en) &&
                role == user.role;
    }


    @Override
    public int hashCode() {

        return Objects.hash(login, password, name_uk, name_en, surname_uk, surname_en, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name_uk='" + name_uk + '\'' +
                ", name_en='" + name_en + '\'' +
                ", surname_uk='" + surname_uk + '\'' +
                ", surname_en='" + surname_en + '\'' +
                ", role=" + role +
                '}';
    }

    public static class Builder{

        ResourceBundle resourceBundleEn = ResourceBundle.getBundle("resource", new Locale("en", "US"));
        ResourceBundle resourceBundleUk = ResourceBundle.getBundle("resource", new Locale("uk", "UA"));

        private int id = 0;
        private String login = resourceBundleEn.getString("DEFAULT");
        private String password =resourceBundleEn.getString("DEFAULT");
        private String name_uk = resourceBundleUk.getString("GUEST");
        private String name_en = resourceBundleEn.getString("GUEST");
        private String surname_uk = resourceBundleEn.getString("DEFAULT");
        private String surname_en = resourceBundleEn.getString("DEFAULT");
        public Role role = Role.GUEST;

        public Builder() {
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setName_uk(String name_uk) {
            this.name_uk = name_uk;
            return this;
        }

        public Builder setName_en(String name_en) {
            this.name_en = name_en;
            return this;
        }

        public Builder setSurname_uk(String surname_uk) {
            this.surname_uk = surname_uk;
            return this;
        }

        public Builder setSurname_en(String surname_en) {
            this.surname_en = surname_en;
            return this;
        }

        public Builder setRole(Role role) {
            this.role = role;
            return this;
        }

        public User build (){
            return new User(this);
        }
    }
}


/*

    public Procedure build(){
        return new Procedure(this);
    }*/
