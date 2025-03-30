	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.Select;
	import java.util.List;

	public class CheckboxTest {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");  // Replace with your chromedriver path

	        // Initialize the WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Add an implicit wait to ensure elements are loaded before interactions
	        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

	        // Load the URL
	        driver.get("https://leafground.com/checkbox.xhtml");

	        // Click on the "Basic Checkbox"
	        WebElement basicCheckbox = driver.findElement(By.id("j_idt88:basic"));
	        if (!basicCheckbox.isSelected()) {
	            basicCheckbox.click(); // Click if not selected
	        }

	        // Click on the "Notification Checkbox"
	        WebElement notificationCheckbox = driver.findElement(By.id("j_idt88:notify"));
	        if (!notificationCheckbox.isSelected()) {
	            notificationCheckbox.click(); // Click if not selected
	        }

	        // Verify that the expected message is displayed for the notification checkbox
	        WebElement notificationMessage = driver.findElement(By.id("j_idt88:msg"));
	        if (notificationMessage.isDisplayed()) {
	            System.out.println("Notification message is displayed: " + notificationMessage.getText());
	        } else {
	            System.out.println("Notification message is not displayed.");
	        }

	        // Click on your favorite language (assuming it's related to checkboxes)
	        WebElement languageCheckbox = driver.findElement(By.id("j_idt88:languages_input"));
	        if (!languageCheckbox.isSelected()) {
	            languageCheckbox.click();
	        }

	        // Click on the "Tri-State Checkbox"
	        WebElement triStateCheckbox = driver.findElement(By.id("j_idt88:triState"));
	        triStateCheckbox.click();

	        // Verify which tri-state option has been chosen
	        String triStateValue = triStateCheckbox.getAttribute("aria-checked");
	        System.out.println("Tri-state checkbox is in '" + triStateValue + "' state");

	        // Click on the "Toggle Switch"
	        WebElement toggleSwitch = driver.findElement(By.id("j_idt88:toggle"));
	        toggleSwitch.click();

	        // Verify that the expected message is displayed for the toggle switch
	        WebElement toggleMessage = driver.findElement(By.id("j_idt88:toggleMessage"));
	        if (toggleMessage.isDisplayed()) {
	            System.out.println("Toggle switch message: " + toggleMessage.getText());
	        } else {
	            System.out.println("Toggle switch message is not displayed.");
	        }

	        // Verify if the Checkbox is disabled (check for the "disabled" attribute)
	        WebElement disabledCheckbox = driver.findElement(By.id("j_idt88:disabled"));
	        if (!disabledCheckbox.isEnabled()) {
	            System.out.println("The checkbox is disabled.");
	        } else {
	            System.out.println("The checkbox is enabled.");
	        }

	        // Select multiple checkboxes on the page (Example: Select all available languages)
	        WebElement languagesDropdown = driver.findElement(By.id("j_idt88:languages"));
	        Select languagesSelect = new Select(languagesDropdown);
	        List<WebElement> languageOptions = languagesSelect.getOptions();

	        System.out.println("Selecting multiple language options:");
	        for (WebElement option : languageOptions) {
	            option.click();
	            System.out.println("Selected: " + option.getText());
	        }

	        // Perform any additional actions or verifications if needed
	        // For this example, we're performing basic interactions with checkboxes

	        // Close the browser window when done
	        driver.quit();
	    }
	}
}
