const expenseUrl = "http://localhost:8080/api/expenses";

async function fetchExpenses() {
  const res = await fetch(expenseUrl);
  const data = await res.json();

  const tbody = document.querySelector("#expenseTable tbody");
  tbody.innerHTML = "";

  data.forEach(expense => {
    const row = document.createElement("tr");
    row.innerHTML = `
      <td>${expense.title}</td>
      <td>${expense.amount}</td>
      <td>
        <button onclick="editExpense(${expense.id})">Edit</button>
        <button onclick="deleteExpense(${expense.id})">Delete</button>
      </td>
    `;
    tbody.appendChild(row);
  });
}

function showCreateForm() {
  document.getElementById("createExpense").style.display = "block";
}

async function createExpense() {
  const title = document.getElementById("expenseTitle").value;
  const amount = document.getElementById("expenseAmount").value;

  const res = await fetch(expenseUrl, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ title, amount })
  });

  if (res.ok) {
    alert("Expense added");
    fetchExpenses();
    document.getElementById("createExpense").style.display = "none";
  } else {
    alert("Error adding expense");
  }
}

async function deleteExpense(id) {
  await fetch(`${expenseUrl}/${id}`, { method: "DELETE" });
  fetchExpenses();
}

window.onload = fetchExpenses;
