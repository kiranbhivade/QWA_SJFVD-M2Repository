package com.AutomationFramework2.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.AutomationFramework2.genericLib.BaseTest;

public class CreateNewProjectPage extends BaseClass {

	public CreateNewProjectPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//select[@name='customerId']")
	private WebElement customerDropdown;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement projectNameTextfield;

	@FindBy(xpath = "//input[@name='createProjectSubmit']")
	private WebElement createProjectButton;

	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	public WebElement getProjectNameTextfield() {
		return projectNameTextfield;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}

	public void createCustomerAndProject(String customername, String projectname,WebDriver driver) throws InterruptedException {
		CreateNewCustomerPage page = new CreateNewCustomerPage(driver);
		page.getCustomerNameTextField().sendKeys(customername);
		page.getCreateCustomerButton().click();
		ProjectAndCustomerPage pp = new ProjectAndCustomerPage(driver);
		pp.clickOnCreateNewProject();
		Select s = new Select(customerDropdown);
		customerDropdown.click();
		s.selectByVisibleText(customername);
		projectNameTextfield.sendKeys(projectname);
		createProjectButton.click();
	}

}
