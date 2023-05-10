package com.kavish.tutorials.banking.controller;

import com.kavish.tutorials.banking.model.Expense;
import com.kavish.tutorials.banking.model.Income;
import com.kavish.tutorials.banking.service.CashFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cash-flow/v1")
public class CashFlowController {
    @Autowired
    private CashFlowService cashFlowService;

    @GetMapping("/incomes")
    public List<Income> getIncomes() throws Exception {
        return cashFlowService.getIncomes();
    }

    @GetMapping("/expenses")
    public List<Expense> getExpenses() throws Exception {
        return cashFlowService.getExpenses();
    }
}
