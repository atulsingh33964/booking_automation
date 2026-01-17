# Booking.com UI Automation – Playwright + Java

This project automates an end-to-end hotel search and booking validation flow on Booking.com using Playwright with Java.

---

## 🚀 Tech Stack
- Java 17
- Playwright for browser automation
- Maven for dependency management
- JUnit for test execution
- Git for version control

---

## 📂 Project Structure

ui_tests/
 ├── pom.xml
 ├── README.md
 ├── src/test/java
 │    ├── base
 │    │    └── BaseTest.java
 │    ├── pages
 │    │    └── BookingPage.java
 │    └── tests
 │         └── BookingTest.java
 ├── screenshots
 └── target

---

## ✅ Automated Test Flow

1. Launch Booking.com homepage.
2. Validate search input visibility.
3. Enter destination: Goa, India.
4. Click search button.
5. Wait for hotel results to load.
6. Fetch hotel listings from the first page.
7. Print hotel names in console logs.
8. Capture screenshot as execution proof.

---

## ▶️ How To Run

### Prerequisites
- Java 17+
- Maven installed
- Git installed

---

### Install Playwright Browsers
Run once:

mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"

---

### Run Tests

mvn clean test

---

## 📸 Execution Evidence
- Screenshots are stored in the `screenshots/` directory.
- Console logs display extracted hotel information.

---

## 🧩 Framework Design

- Page Object Model is used to separate locators from test logic.
- BaseTest handles browser lifecycle management.
- BookingPage stores all UI locators.
- BookingTest contains business flow validation.

---

## 👤 Author
Atul Vikram Singh