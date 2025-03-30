package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsAutomation {
    public static void main(String[] args) {
       
        // Initialize WebDriver (ChromeDriver)
        ChromeDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/");

        // Maximize the browser window
        driver.manage().window().maximize(); 

        // Enter the username
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("DemoSalesManager");

        // Enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("crmsfa");

        // Click the "Login" button
        WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
        loginButton.click();

        // Click on the "CRM/SFA" link
        WebElement crmLink = driver.findElement(By.linkText("CRM/SFA"));
        crmLink.click();

        // Click on the "Accounts" tab
        WebElement accountsTab = driver.findElement(By.linkText("Accounts"));
        accountsTab.click();

        // Click on the "Create Account" button
        WebElement createAccountButton = driver.findElement(By.linkText("Create Account"));
        createAccountButton.click();

        // Enter an account name
        WebElement accountNameField = driver.findElement(By.id("accountName"));
        accountNameField.sendKeys("Test Account");

        // Enter a description
        WebElement descriptionField = driver.findElement(By.id("description"));
        descriptionField.sendKeys("Selenium Automation Tester");

        // Enter the number of employees
        WebElement numEmployeesField = driver.findElement(By.id("numberOfEmployees"));
        numEmployeesField.sendKeys("100");

        // Enter the site name
        WebElement siteNameField = driver.findElement(By.id("siteName"));
        siteNameField.sendKeys("LeafTaps");

        // Click the "Create Account" button to create the account
        WebElement createAccountSubmitButton = driver.findElement(By.name("submitButton"));
        createAccountSubmitButton.click();

        // Verify that the Title is displayed (successful account creation page)
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("View Account")) {
            System.out.println("Account created successfully, page title: " + pageTitle);
        } else {
            System.out.println("Account creation failed, current page title: " + pageTitle);
        }

        // Close the browser
        driver.quit();
    }
}