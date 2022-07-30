package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	// ExtentSparkReporter ---> Doc/Report/Theme
	// ExtentReports ----> 
	public static ExtentReports extent;
	public static ExtentReports getRports() {
		String path="C:\\Users\\TJIN\\eclipse-workspace\\Hello World\\Batch_11_Framework\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Reports");
		reporter.config().setReportName("Batch 11 Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Batch 11 Demo Project" );
		extent.setSystemInfo("Module Name", "ABC module");
		extent.setSystemInfo("Browser Name", "Chrome");
		extent.setSystemInfo("Version Selenium","3.141.59");
		extent.setSystemInfo("QA", "ABC");
		
		return extent;
		
		
	}

}
