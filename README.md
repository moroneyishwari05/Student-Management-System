# 🎓 Student Management System

A full-featured **Spring Boot CRUD Application** for managing student records efficiently.  
This project demonstrates the implementation of:

- Spring Boot MVC
- Spring Data JPA
- Thymeleaf
- PostgreSQL
- Bootstrap UI

---

## 🚀 Features

✅ Add New Students  
✅ View Student List  
✅ Update Student Details  
✅ Delete Students  
✅ Responsive Bootstrap UI  
✅ PostgreSQL Database Integration  
✅ MVC Architecture  

---

## 🛠️ Tech Stack

| Technology | Usage |
|------------|-------|
| Java 21 | Backend Language |
| Spring Boot | Framework |
| Spring MVC | Web Architecture |
| Spring Data JPA | Database Operations |
| PostgreSQL | Database |
| Thymeleaf | Template Engine |
| Bootstrap | Frontend Styling |
| Maven | Dependency Management |

---

## 📂 Project Structure

```text
src
 ┣ main
 ┃ ┣ java
 ┃ ┃ ┗ com.day4
 ┃ ┃   ┣ controller
 ┃ ┃   ┣ entity
 ┃ ┃   ┣ repository
 ┃ ┃   ┣ service
 ┃ ┃   ┗ serviceIMPL
 ┃ ┗ resources
 ┃   ┣ templates
 ┃   ┗ application.properties
 ┗ test
```

---

## 📸 Screenshots

### 🏠 Student List Page

- Displays all students
- Update/Delete actions
- Bootstrap styled table

### ➕ Add Student Page

- Form validation
- Responsive card design

### ✏️ Update Student Page

- Edit existing student details

---

## ⚙️ Installation & Setup

### 1️⃣ Clone Repository

```bash
git clone https://github.com/moroneyishwari05/Student-Management-System.git
```

---

### 2️⃣ Open Project

Open project in:
- Eclipse
- IntelliJ IDEA
- VS Code

---

### 3️⃣ Configure PostgreSQL

Update `application.properties`

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 4️⃣ Run Application

```bash
mvn spring-boot:run
```

---

## 🌐 Application URL

```text
http://localhost:8081/students
```

---

## 📚 CRUD Operations

| Operation | Endpoint |
|----------|----------|
| View Students | `/students` |
| Add Student | `/students/new` |
| Save Student | `/students` |
| Edit Student | `/students/edit/{id}` |
| Delete Student | `/students/delete/{id}` |

---

## 💡 Learning Concepts Used

- Dependency Injection
- MVC Architecture
- REST-style Routing
- ORM with Hibernate
- Thymeleaf Template Engine
- CRUD Operations
- Bootstrap Responsive Design

---

## 👩‍💻 Author

### Ishwari Moroney

📌 Computer Science Engineering Student  
📌 Spring Boot & Java Developer  

GitHub:  
https://github.com/moroneyishwari05

---

## ⭐ Future Enhancements

- Search Functionality
- Pagination
- Student Photo Upload
- Authentication & Authorization
- REST API Integration
- Docker Deployment

---

## 📄 License

This project is created for learning and educational purposes.
