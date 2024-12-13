package com.sparks.sparksbudgetingapp.model;

import java.util.Date;

public class Expense {
    private int expenseId;
    private String category;
    private float amount;
    private Date date;

    public Expense(int expenseId, String category, float amount, Date date) {
        this.expenseId = expenseId;
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getAmount() {
        return amount;
    }

    public float setAmount(float amount) {
        return this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void addExpense(float amount) {
        this.amount += amount;
    }

    public void deleteExpense(float amount) {
        this.amount -= amount;
    }
}
