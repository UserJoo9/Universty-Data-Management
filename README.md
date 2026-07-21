# 🎓 DTU University Data Management System

A desktop application built with JavaFX for managing university data including students, professors, courses, and departments. Developed for **DTU (Delta Technological Universty)**.

---

## 📋 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation & Setup](#installation--setup)
- [Usage](#usage)
- [Login Credentials](#login-credentials)
- [Data Storage](#data-storage)
- [Architecture](#architecture)
- [Known Issues & Limitations](#known-issues--limitations)
- [Future Improvements](#future-improvements)

---

## ✨ Features

| Module | Operations |
|--------|------------|
| **Students** | Add, Edit, Search, Delete student records |
| **Professors** | Add, Edit, Search, Delete professor records |
| **Courses** | Add, Edit, Search, Delete course records |
| **Departments** | Add, Edit, Search, Delete department records |

- 🔐 Login authentication system
- 📊 Dashboard with module navigation
- 🎨 Custom-styled UI with dark table theme
- 📁 File-based persistent data storage

---

## 🛠 Tech Stack

| Component | Technology |
|-----------|------------|
| **Language** | Java 17 |
| **UI Framework** | JavaFX 17 |
| **UI Layout** | FXML |
| **Icons** | FontAwesomeFX 8.9 |
| **IDE** | IntelliJ IDEA |
| **Data Storage** | Flat text files (`.txt`) |

---

## 📁 Project Structure

```
Universty Data Management/
├── src/
│   └── sample/
│       ├── Main.java              # Application entry point
│       ├── LogIn.java             # Login controller & authentication
│       ├── Controller.java        # Central controller (all CRUD operations)
│       ├── student.java           # Student entity & file operations
│       ├── professor.java         # Professor entity & file operations
│       ├── courses.java           # Course entity & file operations
│       ├── departments.java       # Department entity & file operations
│       │
│       ├── *.fxml                 # JavaFX UI layouts
│       │   ├── sample.fxml        # Login page
│       │   ├── Dashboard.fxml     # Main dashboard
│       │   ├── Students.fxml      # Student list view
│       │   ├── AddStudend.fxml    # Add/Edit student form
│       │   ├── professors.fxml    # Professor list view
│       │   ├── AddProfessor.fxml  # Add/Edit professor form
│       │   ├── courses.fxml       # Course list view
│       │   ├── AddCourse.fxml     # Add/Edit course form
│       │   ├── Department.fxml    # Department list view
│       │   └── AddDepartment.fxml # Add/Edit department form
│       │
│       ├── *.css                  # Stylesheets
│       │   ├── style.css          # General button styles
│       │   └── table.css          # Table view styles (dark theme)
│       │
│       ├── img/                   # Image assets
│       │   ├── dtu-logo-en.png    # University logo
│       │   └── lock.png           # Lock icon
│       │
│       └── *_in.txt / *_out.txt   # Data files
│           ├── student_in.txt
│           ├── professor_in.txt
│           ├── courses_in.txt
│           └── departments_in.txt
│
├── out/                           # Compiled output (IDEA)
├── .idea/                         # IntelliJ IDEA config
├── untitled7.iml                  # Module descriptor
└── .gitignore
```

---

## ⚙️ Prerequisites

- **Java Development Kit (JDK) 17** or later
- **JavaFX 17** SDK
- **IntelliJ IDEA** (recommended) or any Java IDE

---

## 🚀 Installation & Setup

### Option 1: IntelliJ IDEA (Recommended)

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd "Universty Data Management"
   ```

2. **Open in IntelliJ IDEA:**
   - File → Open → Select the project directory

3. **Configure JavaFX SDK:**
   - File → Project Structure → Libraries
   - Add JavaFX SDK library

4. **Add FontAwesomeFX dependency:**
   - Ensure `fontawesomefx-8.9.jar` is in the project classpath
   - Or add via Maven/Gradle (see below)

5. **Run the application:**
   - Open `src/sample/Main.java`
   - Right-click → Run 'Main.main()'

### Option 2: Command Line

```bash
# Compile (adjust paths for your system)
javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml \
  -cp "src" -d out src/sample/*.java

# Run
java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml \
  -cp out sample.Main
```

---

## 📖 Usage

### 1. Login
- Launch the application
- Enter your credentials on the login screen
- Click "Log In"

### 2. Dashboard
After login, you'll see the main dashboard with four management modules:
- **Manage Students** - Student record management
- **Manage Departments** - Department/category management
- **Manage Course** - Course record management
- **Manage Professors** - Professor record management

### 3. CRUD Operations
Each module provides four operations:
- **Add** - Create new records
- **Edit** - Update existing records (enter old data in left fields, new data in right fields)
- **Search** - Find records by entering search criteria
- **Delete** - Remove records

---

## 🔑 Login Credentials

| Username | Password | Role |
|----------|----------|------|
| `dtu` | `dtu` | Standard User |
| `a` | `a` | Root/Admin |
| `youssef` | *(empty)* | Standard User |

> ⚠️ **Security Note:** Credentials are hardcoded for development purposes. Do not use in production.

---

## 💾 Data Storage

The application uses **flat text files** for data persistence:

| Entity | Input File | Output File |
|--------|------------|-------------|
| Students | `student_in.txt` | `student_out.txt` |
| Professors | `professor_in.txt` | `professor_out.txt` |
| Courses | `courses_in.txt` | `courses_out.txt` |
| Departments | `departments_in.txt` | `departments_out.txt` |

### Data Format Examples

**Student Record:**
```
Name youssef :  Dept dtu :  Lev 1 :  Ph 1
```

**Professor Record:**
```
mohammed:0113131:20000.0:true:false:false:false
```

**Course Record:**
```
112:java programming :400.0:3:150.0
```

**Department Record:**
```
dtu
```

---

## 🏗 Architecture

```
┌─────────────────────────────────────────────────────────┐
│                    JavaFX UI Layer                       │
│  ┌──────────┐ ┌──────────┐ ┌──────────┐ ┌──────────┐   │
│  │ Students │ │  Courses │ │ Professors│ │Depts     │   │
│  │  FXML    │ │  FXML    │ │  FXML    │ │  FXML    │   │
│  └────┬─────┘ └────┬─────┘ └────┬─────┘ └────┬─────┘   │
│       │             │            │             │          │
│  ┌────▼─────────────▼────────────▼─────────────▼─────┐  │
│  │              Controller.java                       │  │
│  │         (Central Event Handler)                    │  │
│  └────────────────────┬───────────────────────────────┘  │
│                       │                                  │
│  ┌────────────────────▼───────────────────────────────┐  │
│  │              Entity Classes                         │  │
│  │  student.java │ professor.java │ courses.java │ ... │  │
│  └────────────────────┬───────────────────────────────┘  │
│                       │                                  │
│  ┌────────────────────▼───────────────────────────────┐  │
│  │           File I/O Layer                            │  │
│  │     Flat text files (*_in.txt / *_out.txt)          │  │
│  └────────────────────────────────────────────────────┘  │
└─────────────────────────────────────────────────────────┘
```

### Design Pattern
- **MVC (Model-View-Controller):**
  - **Model:** `student.java`, `professor.java`, `courses.java`, `departments.java`
  - **View:** FXML files
  - **Controller:** `Controller.java`, `LogIn.java`

---

## ⚠️ Known Issues & Limitations

| Issue | Description |
|-------|-------------|
| 🔴 **Hardcoded Paths** | File paths are hardcoded to `D:\untitled7\src\sample\` — won't work on other machines |
| 🔴 **No Build System** | No Maven/Gradle — manual dependency management |
| 🟡 **Duplicate Code** | CRUD logic is repeated across all entity classes |
| 🟡 **No Validation** | Input validation only checks for empty fields |
| 🟡 **No Unit Tests** | No test coverage |
| 🟡 **File I/O Race Conditions** | Concurrent access could corrupt data |
| 🟡 **No Data Integrity** | No unique constraints or referential integrity |
| 🟢 **Mixed Naming** | Some fields use camelCase, others use different conventions |
| 🟢 **Commented Code** | Large blocks of commented-out code throughout |

---

## 🚀 Future Improvements

- [ ] **Database Integration** - Replace flat files with SQLite/MySQL
- [ ] **Build System** - Add Maven or Gradle build configuration
- [ ] **Path Configuration** - Use relative paths or configuration file
- [ ] **Input Validation** - Add proper field validation (phone format, score range, etc.)
- [ ] **Error Handling** - Implement proper error dialogs and logging
- [ ] **Unit Tests** - Add JUnit tests for entity classes
- [ ] **Code Refactoring** - Extract common CRUD logic into base class
- [ ] **Search Functionality** - Implement partial/fuzzy search
- [ ] **Data Export** - Add CSV/PDF export capability
- [ ] **Authentication** - Implement secure password hashing
- [ ] **UI/UX** - Add data tables with sorting and filtering

---

## 👥 Authors

Developed as a university project for **DTU (Delta Technological Universty)**.

---

## 📄 License

This project is for educational purposes only.

---

<div align="center">

**Made with ☕ Java & JavaFX**

</div>
