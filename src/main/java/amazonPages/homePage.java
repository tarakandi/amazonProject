package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage 
{
	public WebDriver driver;
	
	public homePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By searchBox = By.id("wotabsearchtextbox");
	By searchButton = By.id("nav-search-submit-button");
	
	public void enterSearchBox(String item)
	{
		driver.findElement(searchBox).sendKeys(item);
	}
	
	public void clickSearchButton()
	{
		driver.findElement(searchButton).click();
	}

}
