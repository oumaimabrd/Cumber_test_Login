package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = null;
	
	@Given("The browser is open")
	public void the_browser_is_open() {
		 System.out.println("Inside step - The browser is open"); 
		 String projectPath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
	}

	@And("user is on Netflix page")
	public void user_is_on_netflix_page() {
		System.out.println("Inside step - user is on Netflix page");
		driver.navigate().to("https://netflix.com");
	}

	@When("user in on Netflix login page")
	public void user_in_on_netflix_login_page() {
		System.out.println("Inside step - user in on Netflix login page");
		driver.findElement(By.xpath("//a[contains(@class,'e1ax5wel2 ew97par0')]")).click();
	}

	@And("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws Throwable{
		System.out.println("Inside step - user enters username and password");
		System.out.println(username);
		System.out.println(password);
		driver.findElement(By.name("userLoginId")).sendKeys(username);   
		driver.findElement(By.name("password")).sendKeys(password);
		
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside step - clicks on login button");
		driver.findElement(By.xpath("(//button[contains(@class,'e1ax5wel2 ew97par0')])[1]")).click();
	}

	@Then("user is redirected to the home page")
	public void user_is_redirected_to_the_home_page() {
		System.out.println("Inside step - user is redirected to the home page");
	}
 


	
}
