package com.sparks.sparksbudgetingapp.model;

import java.util.Date;

public class Transaction {
    private int transactionId;
    private int categoryId;
    private int amount;
    private Date date;
    private String description;
    private int userId;

    public Transaction(int transactionId, int categoryId, int amount, Date date, String description, int userId) {
        this.transactionId = transactionId;
        this.categoryId = categoryId;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.userId = userId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void addTransaction(int categoryId, int amount, Date date, String description, int userId) {
        this.categoryId = categoryId;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.userId = userId;
    }

    public void deleteTransaction(int categoryId, int amount, Date date, String description, int userId) {
        this.categoryId = categoryId;
        this.amount = amount;
        this.date = date;
    }

    public void updateTransaction(int categoryId, int amount, Date date, String description, int userId) {
        this.categoryId = categoryId;
        this.amount = amount;
    }
}
