package com.generics.example;

import java.util.Date;

public class Transaction {

    private Date date;

    private Account account;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}