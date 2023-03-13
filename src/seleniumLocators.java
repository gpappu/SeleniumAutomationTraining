import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class seleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Gayatri");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("Gayatri Pappu");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("charismatic.g@gmail.com");
		driver.findElement(By.cssSelector("[placeholder='Phone Number']")).sendKeys("555-333-5592");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text'][3]")).clear(); //indexing using xpath
		driver.findElement(By.cssSelector("[type='text']:nth-child(4)")).sendKeys("492-059-2059"); //indexing using cssSelector
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("900-559-9903");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); // parent child traversing with cssSelector.



		

	}

}
