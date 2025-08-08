package com.expensetracker.controller;

import com.expensetracker.model.Expense;
import com.expensetracker.model.User;
import com.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins = "*")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/create/{userId}")
    public Expense createExpense(@RequestBody Expense expense, @PathVariable Long userId) {
        User user = new User();
        user.setId(userId);
        expense.setUser(user);
        return expenseService.createExpense(expense);
    }

    @GetMapping("/user/{userId}")
    public List<Expense> getUserExpenses(@PathVariable Long userId) {
        User user = new User();
        user.setId(userId);
        return expenseService.getExpensesByUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
    }

    @PutMapping("/{id}")
    public Expense updateExpense(@RequestBody Expense expense, @PathVariable Long id) {
        expense.setId(id);
        return expenseService.updateExpense(expense);
    }
}
