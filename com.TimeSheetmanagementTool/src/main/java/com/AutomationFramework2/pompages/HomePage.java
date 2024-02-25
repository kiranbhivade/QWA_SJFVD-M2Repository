package com.AutomationFramework2.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@class='content users']")
	private WebElement usersLink;

	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement tasksLink;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutLink;

	public WebElement getUsersLink() {
		return usersLink;
	}

	public WebElement getTasksLink() {
		return tasksLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void clickOnUserLink() {
		usersLink.click();
	}

	public void clickOnTasksLink() throws InterruptedException {
		tasksLink.click();
	}

	public void clickOnlogoutLink() {
		logoutLink.click();
	}

}
