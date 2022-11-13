package org.example.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID_Transaction;

    private Date Date;
    private long Amount;
    private String Transaction_Type;

    @Override
    public String toString() {
        return "Transaction{" +
                "ID_Transaction=" + ID_Transaction +
                ", Date=" + Date +
                ", Amount=" + Amount +
                ", Transaction_Type='" + Transaction_Type + '\'' +
                '}';
    }

    public long getID_Transaction() {
        return ID_Transaction;
    }

    public void setID_Transaction(long ID_Transaction) {
        this.ID_Transaction = ID_Transaction;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public long getAmount() {
        return Amount;
    }

    public void setAmount(long amount) {
        Amount = amount;
    }

    public String getTransaction_Type() {
        return Transaction_Type;
    }

    public void setTransaction_Type(String transaction_Type) {
        Transaction_Type = transaction_Type;
    }
}
