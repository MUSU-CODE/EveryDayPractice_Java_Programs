package seleniumInterviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SelectClassCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		

		// Locate dropdown
		WebElement countryDropdown = driver.findElement(By.id("country"));

		// Create Select object
		Select select = new Select(countryDropdown);

		// Select India
		select.selectByVisibleText("India");

       
		System.out.println("Hi");
		
	}

}
