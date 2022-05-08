package fatec.sp.gov.br.firstspring;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FirstSpringApplicationTests.class)
class FirstSpringApplicationTests {

	@Test
	void contextLoads() {
	}

	// @Test
	// void hello(){
	// 	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	// 	WebDriver browser = new ChromeDriver();
	// 	browser.navigate().to("http://localhost:3000/");
	// 	browser.quit();
	// }

	@Test
	void login_success(){
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("http://localhost:3000/");

		browser.findElement(By.id("email")).sendKeys("admin");
		browser.findElement(By.id("password")).sendKeys("admin");
		browser.findElement(By.id("loginButton")).click();

		assertFalse(browser.getCurrentUrl().equals("http://localhost:3000"));
		// browser.quit();
	}

	@Test
	void show_card_data(){

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("http://localhost:3000/");

		browser.findElement(By.id("email")).sendKeys("admin");
		browser.findElement(By.id("password")).sendKeys("admin");
		browser.findElement(By.id("loginButton")).click();

		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browser.findElement(By.id("Total de conexões"));
		browser.findElement(By.id("Tempo Total"));
		browser.findElement(By.id("Engajamento médio"));
		
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// browser.quit();

	}

	@Test
	void make_filters(){

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("http://localhost:3000/");

		browser.findElement(By.id("email")).sendKeys("admin");
		browser.findElement(By.id("password")).sendKeys("admin");
		browser.findElement(By.id("loginButton")).click();

		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		browser.findElement(By.id("filterButton")).click();
		browser.findElement(By.id("number")).sendKeys("500");
		browser.findElement(By.id("semester")).sendKeys("1");
		browser.findElement(By.id("year")).sendKeys("2010");
		browser.findElement(By.id("applyFilter")).click();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.findElement(By.id("loadingSuccess"));

		// browser.quit();
	}

	@Test
	void make_filter(){

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("http://localhost:3000/");

		browser.findElement(By.id("email")).sendKeys("admin");
		browser.findElement(By.id("password")).sendKeys("admin");
		browser.findElement(By.id("loginButton")).click();

		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browser.findElement(By.id("combo-box-demo")).sendKeys("Gwenneth");
		
		// browser.quit();
	}

	@Test
	void make_filter_in_performance_page(){

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("http://localhost:3000/");

		browser.findElement(By.id("email")).sendKeys("admin");
		browser.findElement(By.id("password")).sendKeys("admin");
		browser.findElement(By.id("loginButton")).click();

		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browser.findElement(By.id("menuButton")).click();

		browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		browser.findElement(By.id("performanceMenu")).click();
		
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browser.findElement(By.id("cardPerformance0"));

		// browser.quit();
	}

	
}
