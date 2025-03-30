package Week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");  // Replace with your chromedriver path

		        // Initialize the WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Maximize the browser window
		        driver.manage().window().maximize();

		        // Load the URL
		        driver.get("http://leaftaps.com/opentaps/");

		        // Enter the username
		        WebElement username = driver.findElement(By.id("username"));
		        username.sendKeys("DemoSalesManager");

		        // Enter the password
		        WebElement password = driver.findElement(By.id("password"));
		        password.sendKeys("crmsfa");

		        // Click the Login button
		        WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		        loginButton.click();

		        // Click on the "CRM/SFA" link
		        WebElement crmSfaLink = driver.findElement(By.linkText("CRM/SFA"));
		        crmSfaLink.click();

		        // Click on the "Accounts" tab
		        WebElement accountsTab = driver.findElement(By.linkText("Accounts"));
		        accountsTab.click();

		        // Click on the "Create Account" button
		        WebElement createAccountButton = driver.findElement(By.linkText("Create Account"));
		        createAccountButton.click();

		        // Enter an account name
		        WebElement accountName = driver.findElement(By.id("accountName"));
		        accountName.sendKeys("Selenium Automation Tester");

		        // Enter a description
		        WebElement description = driver.findElement(By.id("description"));
		        description.sendKeys("Selenium Automation Tester.");

		        // Select "ComputerSoftware" as the industry
		        WebElement industryDropdown = driver.findElement(By.id("industryEnumId"));
		        Select industrySelect = new Select(industryDropdown);
		        industrySelect.selectByVisibleText("Computer Software");

		        // Select "S-Corporation" as ownership
		        WebElement ownershipDropdown = driver.findElement(By.id("ownershipEnumId"));
		        Select ownershipSelect = new Select(ownershipDropdown);
		        ownershipSelect.selectByVisibleText("S-Corporation");

		        // Select "Employee" as the source
		        WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
		        Select sourceSelect = new Select(sourceDropdown);
		        sourceSelect.selectByValue("EMPLOYEE");

		        // Select "eCommerce Site Internal Campaign" as the marketing campaign
		        WebElement campaignDropdown = driver.findElement(By.id("marketingCampaignId"));
		        Select campaignSelect = new Select(campaignDropdown);
		        campaignSelect.selectByIndex(3);  // Assuming "eCommerce Site Internal Campaign" is at index 3

		        // Select "Texas" as the state/province
		        WebElement stateDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
		        Select stateSelect = new Select(stateDropdown);
		        stateSelect.selectByValue("TX");

		        // Click the "Create Account" button
		        WebElement createAccountSubmitButton = driver.findElement(By.className("smallSubmit"));
		        createAccountSubmitButton.click();

		        // Verify that the account name is displayed correctly
		        WebElement accountNameVerification = driver.findElement(By.id("viewAccountName_sp"));
		        String accountNameText = accountNameVerification.getText();
		        if (accountNameText.equals("Selenium Automation Tester")) {
		            System.out.println("Account name is displayed correctly.");
		        } else {
		            System.out.println("Account name is incorrect.");
		        }

		        // Close the browser window
		        driver.quit();
		    }
		}

	}

}
