package com.kavish.tutorials.banking.repository;

import com.kavish.tutorials.banking.model.Expense;
import com.kavish.tutorials.banking.model.Income;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository {
    List<Expense> getExpenses();
}
