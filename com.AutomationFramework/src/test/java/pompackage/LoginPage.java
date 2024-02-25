package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//POM CLASS
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//initialization
	@FindBy(name="username")
	private WebElement usernameTextField;
	
	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement  passwordtextField;
	
	@FindBy (id="keepLoggedInCheckBox")
	private WebElement loggedInCheckbox;
	
	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement loginButton;
    
	
	//gettermethod
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordtextField() {
		return passwordtextField;
	}

	public WebElement getLoggedInCheckbox() {
		return loggedInCheckbox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginIntoActitime(String username,String password)
	{
		usernameTextField.sendKeys(username);
		passwordtextField.sendKeys(password);
		loggedInCheckbox.click();
		loginButton.click();
		
	}
	
	public void invalidLoginIntoActitime(String username,String password)
	{
		usernameTextField.sendKeys(username);
		passwordtextField.sendKeys(password);
		loginButton.click();
		usernameTextField.clear();

	}

}

