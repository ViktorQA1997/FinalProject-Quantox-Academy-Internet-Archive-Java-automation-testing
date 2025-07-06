Here’s your provided `README.md` rewritten in the same style and structure as your reference file:

---

# Internet-Archive-Java-Automation-Testing

This repository contains a Selenium-based automated test suite for verifying key functionalities of the [Internet Archive](https://archive.org) web application.

## 📌 Project Overview

**Tester:** Viktor
**Test Period:** 7 days
**App URL:** [https://archive.org](https://archive.org)

## 🛠️ Technologies Used

* Java
* Selenium WebDriver
* TestNG
* IntelliJ
* ChromeDriver

## ✅ Objective

Ensure that critical functionalities of the Internet Archive website work as expected. Tests focus on:

1. Invalid email validation on sign-up
2. Search functionality for books
3. Sorting validation of movie listings
4. Upload access control (authentication required)
5. Correct page redirection through navigation

## 🔬 Scope of Testing

* Input validation and error messages
* Search result verification
* Sorting logic confirmation
* Authentication enforcement
* Navigation and URL validation

## 🧪 Testing Types

* Automated Functional Testing
* UI Validation
* Negative Testing
* Page Redirection Validation

## 🛠️ Test Environment

* **Browsers:** Chrome, Firefox
* **OS:** Windows 10
* **Tools:** Selenium WebDriver, TestNG, IntelliJ IDEA
* **Environment URL:** [https://archive.org](https://archive.org)

## 📄 Test Cases Overview

### Test 1: Invalid Email Sign-Up Validation

* **Purpose**: Verify that sign-up cannot be completed without a valid email.
* **Flow**:

  * Navigate to the Archive.org movies page.
  * Attempt to sign up with various invalid emails.
  * Confirm that the proper error message is displayed.

### Test 2: Search Results for a Book

* **Purpose**: Verify that searching for "Gravity" returns results.
* **Flow**:

  * Navigate to the Archive.org books section.
  * Perform an advanced search for the keyword "Gravity".
  * Validate that results are displayed.

### Test 3: Sorting Validation

* **Purpose**: Verify that movie results are properly sorted by title.
* **Flow**:

  * Navigate to the colorized movies section.
  * Sort by title.
  * Validate that the correct URL is loaded (additional sorting validation can be uncommented).

### Test 4: Upload Requires Authentication

* **Purpose**: Confirm that upload functionality requires user login.
* **Flow**:

  * Navigate to the Archive.org homepage.
  * Click on the upload button.
  * Validate that the site prompts the user to log in.

### Test 5: Navigation to Feature Films

* **Purpose**: Validate that the user is redirected to the correct Feature Films page.
* **Flow**:

  * Navigate to the videos section.
  * Click on Movies > Feature Films.
  * Validate that the correct URL is loaded.

## 📄 Test Cases (Summary)

| TC ID | Title                             | Priority | Status |
| ----- | --------------------------------- | -------- | ------ |
| TC01  | Invalid email sign-up validation  | High     | ✅ Pass |
| TC02  | Search results for "Gravity" book | High     | ✅ Pass |
| TC03  | Sorting validation for movies     | Medium   | ✅ Pass |
| TC04  | Upload requires authentication    | High     | ✅ Pass |
| TC05  | Navigation to Feature Films       | Medium   | ✅ Pass |

## 🚧 Known Issues

* Shadow DOM sorting validation is currently commented out and requires additional handling for ShadowRoot elements.

## 🔄 Recommendations

* Replace implicit waits with explicit waits for more stable test execution.
* Extend Shadow DOM element handling for complete sorting validation.

## 🤖 Automation Coverage

All test cases (TC01 – TC05) are covered by Selenium automation.

## 📬 Contact

**Author:** Viktor Kokeza
📧 Email: [viktor.kokeza@gmail.com](mailto:viktor.kokeza@gmail.com)

---
