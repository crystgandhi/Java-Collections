import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().setSize(new Dimension(1440, 900));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> suggestions = driver.findElements(By.cssSelector(".sbct"));
		System.out.println(suggestions.size());
		for (int i = 0; i < suggestions.size(); i++) {
			System.out.println(i+"-"+suggestions.get(i).getText());
		}
		//validation		
		Boolean match =suggestions.stream().anyMatch(name ->name.getText().contains("sel"));
		Assert.assertTrue(match);
		driver.close();
	}

}
