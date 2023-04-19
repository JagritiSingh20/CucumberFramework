package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public WebDriver driver;


	@Before
	public void before_or_after() {
		ChromeOptions options = new ChromeOptions(); // options.addArguments("--headless=new");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://practice.automationtesting.in/my-account/");

	}

	@After("Regression")
  
  public void aftervalidation() {
  
  }
}
