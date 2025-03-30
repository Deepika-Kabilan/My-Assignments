package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();

	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	
	 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	 
	 WebElement pwrd = driver.findElement(By.id("password"));
	 pwrd.sendKeys("crmsfa");
	 
	 //click on login
	 driver.findElement(By.className("decorativeSubmit")).click();
	 
	 driver.findElement(By.partialLinkText("CRM")).click();
	 //click on leads
	 driver.findElement(By.linkText("Leads")).click();
	 //click on createlead
	 driver.findElement(By.partialLinkText("Create")).click();
	 //enter company name
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	 //enter the firstName
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepika");
	 //enter the lastName
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kabilan");
	 
	 //click source dropdown
	 WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 //instantiate my select class
	 Select s=new Select(sourcedd);//shortcut for import the class is ctrl+shift+o
	 s.selectByIndex(2);
	 //click industry DD
	 WebElement marketingdd = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	 Select S1=new Select(marketingdd);
	 s1.selectByVisibleText("Automobile");
	 WebElement ownerdd = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	 Select S2=new Select(Ownership);
	 s2.selectByValue("OWN_CCOPR");
	 driver.findElement(By.name("submitButton")).click();
	 String title = driver.getTitle();
	 System.out.println(title);
	 driver.close();
	 
	}}
	
	


