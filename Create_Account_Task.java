package facebook_Create_Account_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Create_Account_Task {

	public static void main(String[] args) throws InterruptedException {				
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement createaccountxpath = driver.findElement(By.xpath("((//a[@role='button'])[2])"));
		createaccountxpath.click();		
		
		Thread.sleep(3000);    //wait for loading webpage
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Sudeep");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Mugilan");

	}

}
