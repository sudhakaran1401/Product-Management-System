# 🚀 Product Management System

A console-based CRUD (Create, Read, Update, Delete) application developed using **Java, JDBC, MySQL, and Maven**.
This project allows users to manage product records through a simple menu-driven console interface with MySQL database connectivity.

---

# ✨ Features

* ✅ CRUD Operations on Products
* ✅ MySQL Database Connectivity
* ✅ JDBC Integration
* ✅ Menu-Driven Console Application
* ✅ Maven Project Structure

---

# 🛠️ Tech Stack

* ☕ Java
* 🔗 JDBC
* 🗄️ MySQL
* 📦 Maven
* 💻 VS Code

---

# 📂 Project Structure

```text
productmanagement
│
├── pom.xml
├── src
│   └── main
│       └── java
│           └── com
│               └── example
│                   ├── App.java
│                   ├── DBConnection.java
│                   ├── Product.java
│                   └── ProductDAO.java
```

---

# ⚙️ Configure Database Connection

Update your MySQL credentials inside:

```text
DBConnection.java
```

```java
String url = "jdbc:mysql://localhost:3306/productdb";
String user = "root";
String password = "yourpassword";
```

---

# ▶️ How to Run the Project

## Step 1 — Clone Repository

```bash
git clone https://github.com/yourusername/product-management-system.git
```

## Step 2 — Open Project Folder

```bash
cd product-management-system
```

## Step 3 — Compile Project

```bash
mvn clean compile
```

## Step 4 — Run Application

```bash
java -cp target/classes com.example.App
```

---

# 📸 Console Menu

```text
===== PRODUCT MANAGEMENT SYSTEM =====

1. Add Product
2. View Products
3. Update Product
4. Delete Product
5. Exit
```

---

# 🎯 Learning Outcomes

* JDBC Connectivity
* CRUD Operations
* MySQL Integration
* Maven Build Management
* Java OOP Concepts
* Exception Handling
* Database Management

---

# 🔮 Future Enhancements

* 🔐 User Authentication & Login System
* 🌐 Spring Boot Web Application with Frontend UI
* 🔎 Product Search and Filter Functionality
* 📊 Dashboard with Product Statistics
* 📱 Responsive UI using Bootstrap
* 📦 Product Category Management
* 🧾 Invoice / Billing Module
* 📁 File Upload for Product Images
* 🔔 Low Stock Alert System
* 📄 Export Data to PDF or Excel
* 🧪 Unit Testing with JUnit
* ☁️ Cloud Deployment (Render / Railway / AWS)
* 🔗 REST API Integration
* 📈 Pagination and Sorting
* 🐳 Docker Containerization

---

# 👨‍💻 Author

**Sudha Karan**

⭐ If you found this project useful, consider giving it a star on GitHub!
