package hust.edu.model;

import java.util.Date;

public class HustPerson {
    protected String fullName = "";
    protected String firstName = "";
    protected String middleName = "";
    protected String lastName = "";
    protected Date birdDate;
    protected String idNumber = "";

    public HustPerson(String fullName, String idNumber) {
        setFullName(fullName);
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
        String[] names = fullName.split(" ");
        firstName = names[0];
        lastName = names[names.length - 1];
        for (int i = 1; i < names.length - 1; i++) {
            middleName += names[i] + (i < (names.length - 2) ? " " : "");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirdDate() {
        return birdDate;
    }

    public void setBirdDate(Date birdDate) {
        this.birdDate = birdDate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
