package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get(" https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Step 6: Click on Create New Account button
		WebElement clickCreateAccountButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clickCreateAccountButton.click();
		
		// Step 7: Enter the first name
		WebElement firstNameTextBox = driver.findElement(By.xpath("//div[@id='fullname_field']//input"));
		firstNameTextBox.sendKeys("Saranya");
		
		// Step 8: Enter the last name
		WebElement lastNameTextBox = driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input"));
		lastNameTextBox.sendKeys("K");
		
		// Step 9: Enter the mobile number
		WebElement mobileNumberTextBox = driver.findElement(By.xpath("//div[contains(text(),'Mobile number')]/following-sibling::input"));
		mobileNumberTextBox.sendKeys("8438994035");
		
		// Step 10: Enter the password(*** using Absolute xpath***)
		WebElement passwordTextBox = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
		passwordTextBox.sendKeys("Welcome@123");
		
		// Step 11: Handle all the three drop downs
		WebElement dataDropDown = driver.findElement(By.id("day"));
		Select select = new Select(dataDropDown);
		select.selectByVisibleText("01");
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropDown);
		monthSelect.selectByIndex(8);
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		yearSelect.selectByValue("1992");
		
		
		// Step 12: Select the radio button "Female" 
		//( A normal click will do for this step) 
		
		WebElement femaleRadioButton = driver.findElement(By.xpath("//label[text()='Female']"));
		femaleRadioButton.click();
	}

}
