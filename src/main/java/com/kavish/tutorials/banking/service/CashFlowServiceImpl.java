package com.kavish.tutorials.banking.service;

import com.kavish.tutorials.banking.model.Expense;
import com.kavish.tutorials.banking.model.Income;
import com.kavish.tutorials.banking.repository.ExpenseRepository;
import com.kavish.tutorials.banking.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CashFlowServiceImpl implements CashFlowService{
    @Autowired
    private IncomeRepository incomeRepository;
    @Autowired
    private ExpenseRepository expenseRepository;
    @Override
    public List<Income> getIncomes() throws Exception {
        return incomeRepository.getIncomes();
    }

    @Override
    public List<Expense> getExpenses() throws Exception {
        return expenseRepository.getExpenses();
    }
}
