This repository contains a Selenium-based automated test suite for verifying key functionalities of the Internet Archive web application.

📌 Project Overview
Tester: Viktor
Test Period: 7 days
App URL: https://archive.org

✅ Objective
Ensure that critical functionalities of the Internet Archive website work as expected. Tests focus on:

Invalid email validation on sign-up

Search functionality for books

Sorting validation of movie listings

Upload access control (authentication required)

Correct page redirection through navigation

🔬 Scope of Testing
Input validation and error messages

Search result verification

Sorting logic confirmation

Authentication enforcement

Navigation and URL validation

🧪 Testing Types
Automated Functional Testing

UI Validation

Negative Testing

Page Redirection Validation

🛠️ Test Environment
Browsers: Chrome, Firefox

OS: Windows 10

Tools: Selenium WebDriver, TestNG, IntelliJ IDEA

Environment URL: https://archive.org

📄 Test Cases (Summary)
TC ID	Title	Priority	Status
TC01	Invalid email sign-up validation	High	✅ Pass
TC02	Search results for "Gravity" book	High	✅ Pass
TC03	Sorting validation for movies	Medium	✅ Pass
TC04	Upload requires authentication	High	✅ Pass
TC05	Navigation to Feature Films	Medium	✅ Pass

🚧 Known Issues
Shadow DOM sorting validation is currently commented out and requires additional handling for ShadowRoot elements.

🔄 Recommendations
Replace implicit waits with explicit waits for more stable test execution.

Extend Shadow DOM element handling for complete sorting validation.

🤖 Automation Coverage
All test cases (TC01 – TC05) are covered by Selenium automation.

📬 Contact
Author: Viktor Kokeza
📧 Email: viktor.kokeza@gmail.com
