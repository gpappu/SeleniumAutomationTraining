import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Gayatri");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		

	}

}
