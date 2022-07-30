package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPOM;
import Com.Utility.BaseClass;
import Com.Utility.Library;

public class Test_1 extends BaseClass {
	
	@Test
	public void verify_TC_001() {
		LoginPOM login=PageFactory.initElements(driver, LoginPOM.class);
		
		
		Library.custom_SendKeys(login.getTxt_email(),excel.getStringData("sheet1", 0, 0));
		Library.custom_SendKeys(login.getTxt_password(),excel.getStringData("sheet1", 0, 1));
	
		
	}
	
	

}
