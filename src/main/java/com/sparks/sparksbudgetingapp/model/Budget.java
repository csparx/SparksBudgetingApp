package com.sparks.sparksbudgetingapp.model;

public class Budget {
    private int budgetID;
    private int userID;
    private float totalAmount;
    private float remainingAmount;

    public Budget(int budgetID, int userID, float totalAmount, float remainingAmount) {
        this.budgetID = budgetID;
        this.userID = userID;
        this.totalAmount = totalAmount;
        this.remainingAmount = remainingAmount;
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

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
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
}
