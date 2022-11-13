package org.example.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="accounts")
public class Account {
    private long ID;
    private String SSN;
    private String password;
    private long balance;
    private Date creationDate;

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", SSN='" + SSN + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", creationDate=" + creationDate +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSD(String SSN) {
        this.SSN = SSN;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    private String Name;
    private String Surname;
}
