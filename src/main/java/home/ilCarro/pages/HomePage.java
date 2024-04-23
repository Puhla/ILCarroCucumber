package home.ilCarro.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
public HomePage (WebDriver driver) {
	super (driver);
}

@FindBy(css = "h1")
WebElement homePageTitle;

public HomePage isHomePageTitleDisplayed () {
	assert isElementDisplayed (homePageTitle);
	return new HomePage (driver);
}

@FindBy(css = ".navigation-link:nth-child(6)")
WebElement loginLink;

public LoginPage clickOnLoginLink () {
	click (loginLink);
	return new LoginPage (driver);
}

@FindBy(id = "city")
WebElement enterCity;
@FindBy(id = "dates")
WebElement enterDates;

public HomePage enterTheCityAndDates (String findCity, String dates) {
	type (enterCity, findCity);
	type (enterDates, dates);
	return new HomePage (driver);
}

@FindBy(css = "[type='submit']")
WebElement submitButton;

public HomePage clickToFindACar () {
	click (submitButton);
	return new HomePage (driver);
}

@Then("User enter the city and dates")
public void enter_the_city () {
	new HomePage (driver).enterTheCityAndDates ("Haifa, Israel", "4/29/2024 - 4/30/2024");
}

@Then("User clicks on Yalla button to find car")
public void click_on_Yalla_button () {
	new HomePage (driver).clickToFindACar ();
}
}

