package com.sparks.sparksbudgetingapp.controller;

import com.sparks.sparksbudgetingapp.model.Budget;
import com.sparks.sparksbudgetingapp.service.BudgetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Controller
@RequestMapping("/budget")
public class BudgetController {

    @GetMapping("/add")
    public String showAddBudgetPage(Model model){
        model.addAttribute("budget", new Budget());
        return "add-budget";
    }

    @PostMapping("/add")
    public ResponseEntity<Budget> createBudget(@ModelAttribute Budget budget){
        Budget createdBudget = BudgetService.createBudget(budget);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBudget);
    }
}
