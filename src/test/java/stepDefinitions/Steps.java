package stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginToApp;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps{
	public static String Username = "Jagriti.spmit@gmail.com";
	public static String Password = "7200$inNH";
	/*
	 * public static String username; public static String password;
	 */
	LoginToApp logintoapp;
	Hooks hooks;
	//WebDriver driver;

	public Steps(Hooks hooks) {
		/*
		 * this.driver=driver; PageFactory.initElements(driver,this);
		 */
		//Hooks hooks = new Hooks();
		logintoapp = new LoginToApp(hooks.driver);
	}

	@SuppressWarnings("deprecation")
	@Given("^User is on landing page$")
	public void user_is_on_landingpage() throws InterruptedException {
		//logintoapp.navigatetoapp();
		/// hooks.before_or_after();
		System.out.println("User navigated to landing page");
	}

	@When("^user login into application with Username and Password$")
	public void user_login_into_application(DataTable table) throws InterruptedException {
		logintoapp.Login(Username, Password);

		Map<String, String> credentials = table.asMap();
		if (credentials.containsKey("Username") && credentials.containsKey("Password")) {
			logintoapp.Login(credentials.get("Username"), credentials.get("Password"));
			System.out.println("User logged in with username and password");
		} else {
			throw new NullPointerException("Username or password not provided");
		}
		
	}

	@Then("^Home page is populated$")
	public void Home_page_is_populated() {
		// logintoapp.verifywelcometext();
		System.out.println("User navigated to landing page");

	}

	@And("^Cards are displayed$")
	public void Cards_are_displayed() {
		System.out.println("Cards are displayed");

	}
}
