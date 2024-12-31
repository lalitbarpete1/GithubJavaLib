package demo.project;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class TestCasesOne {

	public static void main(String[] args) {
	
		WebDriver  driver = new ChromeDriver();
		driver.get("www.aapc.com");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		
		//Alert a = driver.switchTo().alert();
		//a.accept();
		//a.dismiss();
		Select dropdown = new Select(driver.findElement(By.name("Test")));
		dropdown.selectByIndex(0);
		
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Explicit wait 
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = w.until(ExpectedConditions.visibilityOfElementLocated(By.name("test")));
		element.click();
		
		
		// Fluent Wait 
	    Wait<WebDriver> wait =
	            new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(2))
	                .pollingEvery(Duration.ofMillis(300))
	                .ignoring(ElementNotInteractableException.class);

	        wait.until (ExpectedConditions.visibilityOfElementLocated(By.name("test")));
	        
	      //Convert webdriver to TakeScreenshot
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	            Files.copy(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        WebElement elementjs = driver.findElement(By.name ("Lalit"));
	        JavascriptExecutor  js = (JavascriptExecutor) driver ;
	        js.executeScript( "" , elementjs );
	        elementjs.click();
	        
	        
	        Actions act = new Actions(driver);
	        act.doubleClick(elementjs).build().perform();
	       act.dragAndDrop(elementjs, elementjs);
	       act.contextClick().build().perform();
	       act.moveToElement(element).click().perform();
	        
	        
	}
	
}
