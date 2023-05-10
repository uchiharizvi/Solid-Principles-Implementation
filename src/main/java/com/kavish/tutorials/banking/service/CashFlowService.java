package com.kavish.tutorials.banking.service;

import com.kavish.tutorials.banking.model.Expense;
import com.kavish.tutorials.banking.model.Income;

import java.util.List;

public interface CashFlowService {
    List<Income> getIncomes() throws Exception;
    List<Expense> getExpenses() throws Exception;
}
