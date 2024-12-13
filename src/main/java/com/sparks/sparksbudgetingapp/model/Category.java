package com.sparks.sparksbudgetingapp.model;

public class Category {
    private int categoryId;
    private String name;
    private int budgetId;

    public Category(int categoryId, String name, int budgetId) {
        this.categoryId = categoryId;
        this.name = name;
        this.budgetId = budgetId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBudgetId(int budgetId) {
        this.budgetId = budgetId;
    }
    public int getBudgetId() {
        return budgetId;
    }

    public void addCategory(String name, int budgetId) {
        this.name = name;
    }

    public void deleteCategory(String name, int budgetId) {
        this.name = name;
    }



}
