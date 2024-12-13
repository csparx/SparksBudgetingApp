package com.sparks.sparksbudgetingapp.model;

public class Budget {
    private int budgetID;
    private int userID;
    private float amount;
    private float remainingAmount;
    private String name;
    private String category;

    public Budget() {
        this.budgetID = budgetID;
        this.userID = userID;
        this.amount = amount;
        this.remainingAmount = remainingAmount;
        this.name = name;
        this.category = category;
    }

    public int getBudgetID() {
        return budgetID;
    }

    public void setBudgetID(int budgetID) {
        this.budgetID = budgetID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(float remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public void addExpense(float amount) {
        this.remainingAmount -= amount;
    }

    public void viewRemainingBudget() {
        System.out.println("Remaining budget: " + this.remainingAmount);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
