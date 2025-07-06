# Internet-Archive-Java-automation-testing

Here’s a professional `README.md` you can use for your GitHub repository based on the provided code:

---

# Archive.org Automated Testing Suite

This project is an automated UI testing suite for the [Archive.org](https://archive.org) website. It is written in Java using Selenium WebDriver and TestNG. The tests validate several key functionalities of the site, including form validation, search functionality, sorting, upload access restrictions, and navigation.

## Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven (assumed for dependency management)
* ChromeDriver / FirefoxDriver

## Project Structure

* **Tests Package**: Contains all test classes.
* **Pages Package**: Follows the Page Object Model (POM) for page interactions.
* **Utils Package**: Contains shared utilities like base setup, configuration, and custom wait methods.

## Prerequisites

* Java JDK 8 or higher
* Maven
* Chrome or Firefox browser
* Selenium WebDriver dependencies
* TestNG framework

## How to Run the Tests

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/archive-testing-suite.git
   ```
2. Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse).
3. Make sure the WebDriver paths are correctly set in the `BaseClass`.
4. Run the test suite using TestNG.

## Test Cases Overview

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

## Notes

* The project uses implicit waits for simplicity. Consider replacing them with explicit waits for more robust synchronization.
* Some verification steps related to Shadow DOM elements are currently commented out. These can be implemented later if required.

## Contribution

Feel free to fork the repository, open issues, or submit pull requests to improve the test coverage or structure.

## License

This project is open-source and available under the MIT License.

---

If you want, I can also create a version with badges, more detailed setup instructions, or specific Maven configurations. Just let me know!
