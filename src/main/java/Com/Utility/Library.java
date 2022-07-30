package Com.Utility;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import net.bytebuddy.utility.RandomString;

public class Library {
	
	public static ExtentTest test;
	
	
	
	public static void custom_SendKeys(WebElement element,String value) {
		try {
		element.sendKeys(value);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
	
	// for click 
	
	public static void custom_click(WebElement element) {
		try {
		element.click();
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
 
	public static void custom_HandleDropDown(WebElement element,String Text) {
		try {
			Select sel=new Select(element);
			sel.selectByVisibleText(Text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void custom_MouseMovement(WebDriver driver,WebElement element) {
		try {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}

	public static void custom_GetCapture(WebDriver driver) throws Exception {
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		//Date d=new Date();
		//d.getDate();
		
		String rm=RandomString.make(3);
		File destn=new File("C:\\Users\\TJIN\\eclipse-workspace\\Hello World\\Batch_11_Framework\\Screenshot\\"+rm+".png");
	    FileUtils.copyFile(src, destn);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static Alert custom_HandleAlert(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		return alt;
	}
	
	
	
	
	
	
	
	}


