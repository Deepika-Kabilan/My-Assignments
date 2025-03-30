package Week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebooklogin {

	public static void main(String[]args) throws InterruptedException
	{
         
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().windows().maximize();
     driver.findElement(By.id("email")).sendkeys("testleaf.2023@gmail.com");
     driver.findElement(By.id("pass")).sendkeys("Tune@321");
     driver.findElement(By.name("login")).click();
     String title = driver.getTitle();
     System.out.println(title);
	}
     

}
