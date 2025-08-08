package com.expensetracker.service;

import com.expensetracker.model.Expense;
import com.expensetracker.model.User;
import com.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getExpensesByUser(User user) {
        return expenseRepository.findByUser(user);
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }

    public Optional<Expense> getExpenseById(Long id) {
        return expenseRepository.findById(id);
    }

    public Expense updateExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
}
