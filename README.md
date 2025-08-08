# Expense Tracker Application

## 👥 Team Members
- **Pavan Damji (Leader)**
- **Anurag Mane**
- **Kaushik Hatte**
- **Ganesh Hibare**

---

## 📌 Overview
The Expense Tracker Application is a **full-stack web application** designed to help users efficiently **track, manage, and categorize** their expenses.  
It features a **Spring Boot** backend and a **React.js** frontend, with data stored securely in a relational database.

The application supports:
- **User authentication & authorization**  
- **Expense management** (add, update, delete, view)  
- **Expense categorization** for better financial insights  
- **Data validation** to ensure accuracy  

---

## 🛠 Technologies Used
### Backend
- **Java (Spring Boot)** – REST API & business logic
- **Spring Security** – Authentication & authorization
- **Hibernate/JPA** – Database ORM mapping
- **MySQL/PostgreSQL** – Relational database for persistent storage
- **Lombok** – Reducing boilerplate code
- **Maven** – Build and dependency management

### Frontend
- **React.js** – User interface
- **Axios** – HTTP client for API requests
- **Bootstrap / CSS** – Styling

---

## 📂 Project Structure
```
The_Expense_Tracker/
│
├── backend/
│   ├── src/main/java/com/expensetracker/
│   │   ├── controller/       # Handles API requests
│   │   ├── dto/              # Data Transfer Objects
│   │   ├── model/            # Entity classes for database
│   │   ├── repository/       # Interfaces for DB queries
│   │   ├── service/          # Business logic layer
│   │   ├── config/           # Security & configurations
│   │   └── ExpenseTrackerApplication.java
│   ├── src/main/resources/
│   │   ├── application.properties  # DB & server configs
│   │   └── data.sql (optional)     # Initial DB data
│   └── pom.xml
│
├── frontend/
│   ├── index.html
│   ├── style.css
│   └── script.js
│
└── README.md
```

## ⚙ Features
- **🔑 Secure Login & Registration** – User authentication with Spring Security & JWT  
- **💰 Expense Management** – Add, update, delete, and view expenses  
- **📊 Categorization** – Organize expenses into categories for better insights  
- **📅 Date-based Filtering** – Track spending over specific periods  
- **💾 Persistent Storage** – All data stored in a secure relational database  
- **✅ Input Validation** – Ensures only correct and complete data is saved  

---

## 🚀 How to Run
### Backend
1. Navigate to the backend folder:
   ```bash
   cd backend
   ```
2. Configure **application.properties**:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
   spring.datasource.username=YOUR_DB_USERNAME
   spring.datasource.password=YOUR_DB_PASSWORD
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   jwt.secret=YOUR_SECRET_KEY
   ```
3. Build and run the backend:
   ```bash
   mvn spring-boot:run
   ```

### Frontend
1. Navigate to the frontend folder:
   ```bash
   cd frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the development server:
   ```bash
   npm start
   ```

---

## 🖼 Example API Endpoints
| Method | Endpoint                  | Description                  |
|--------|---------------------------|------------------------------|
| POST   | `/api/auth/register`      | Register new user            |
| POST   | `/api/auth/login`         | Authenticate user & get token|
| GET    | `/api/expenses`           | Fetch all expenses           |
| POST   | `/api/expenses`           | Add new expense              |
| PUT    | `/api/expenses/{id}`      | Update expense by ID         |
| DELETE | `/api/expenses/{id}`      | Delete expense by ID         |

---

## 🔒 Security
- JWT-based authentication for secure API access  
- Password encryption using **BCrypt**  
- Role-based authorization to protect endpoints  

---

## 📈 Future Enhancements
- 📊 Expense Analytics Dashboard with charts & graphs  
- 📤 Export expenses to PDF/Excel  
- 📱 Mobile-friendly responsive UI  
- 📌 Multi-currency support  

---
