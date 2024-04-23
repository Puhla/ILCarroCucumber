package com.ilcarro.stepDefinitions;

import home.ilCarro.pages.HomePage;
import home.ilCarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static home.ilCarro.pages.BasePage.driver;

public class LoginSteps {

@And ("User clicks on Login Link")
public void clicks_on_Login_Link(){
	new HomePage(driver).clickOnLoginLink();
}
@And ("User enters valid data")
public void validData(){
	new LoginPage (driver)
			.enterData("vera_1tr@gmail.com","Vera12367#");
}
@And ("User clicks on Yalla button")
public void clicks_on_Yalla_button(){
	new LoginPage (driver).clickOnYallaButton();
}
@Then ("User verifies Success Message is displayed")
public void verifies_Success_Message (){
	new LoginPage (driver).isMessageDisplayed("Logged in success");

}
}
