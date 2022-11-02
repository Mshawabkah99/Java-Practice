import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJavaProject {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");

		String Title = driver.getTitle();
		System.out.println(Title);

		List<WebElement> myListOfElements = driver.findElements(By.tagName("option"));

		for (int i = 0 ; i < myListOfElements.size() ; i++) {
			System.out.println(myListOfElements.get(i).getText());

		}

	}

}
