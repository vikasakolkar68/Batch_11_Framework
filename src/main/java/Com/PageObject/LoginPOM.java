package Com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPOM {
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement txt_password;

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_password() {
		return txt_password;
	}
	
	

	

}
