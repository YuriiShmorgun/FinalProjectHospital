package model.entity;

public class User {

    private int id;
    private String login;
    private String password;
    public Role role;
    private String name_ua;
    private String name_en;
    private String surname_ua;
    private String surname_en;
    private String diagnosis_ua;
    private String diagnosis_en;

    public User(int id, String login, String password, Role role, String name_ua, String name_en, String surname_ua, String surname_en, String diagnosis_ua, String diagnosis_en) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.name_ua = name_ua;
        this.name_en = name_en;
        this.surname_ua = surname_ua;
        this.surname_en = surname_en;
        this.diagnosis_ua = diagnosis_ua;
        this.diagnosis_en = diagnosis_en;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName_ua() {
        return name_ua;
    }

    public void setName_ua(String name_ua) {
        this.name_ua = name_ua;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getSurname_ua() {
        return surname_ua;
    }

    public void setSurname_ua(String surname_ua) {
        this.surname_ua = surname_ua;
    }

    public String getSurname_en() {
        return surname_en;
    }

    public void setSurname_en(String surname_en) {
        this.surname_en = surname_en;
    }

    public String getDiagnosis_ua() {
        return diagnosis_ua;
    }

    public void setDiagnosis_ua(String diagnosis_ua) {
        this.diagnosis_ua = diagnosis_ua;
    }

    public String getDiagnosis_en() {
        return diagnosis_en;
    }

    public void setDiagnosis_en(String diagnosis_en) {
        this.diagnosis_en = diagnosis_en;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
