package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginLogoutTest100Times {

    public WebDriver driver;
    public static String baseURL = "https://schooldemostand-dot-iknotwebpage.el.r.appspot.com/";

    
	@BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(invocationCount = 100)
    public void executeLoginLogoutTest() throws InterruptedException {
        driver.get(baseURL);

        WebElement usernameInput = driver.findElement(By.name("identity"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Sign in ']"));

        usernameInput.sendKeys("mail2inba4");
        passwordInput.sendKeys("password");
        Thread.sleep(1000);
        loginButton.click();

        WebElement dropdown = driver.findElement(By.xpath("(//ul[@class='navbar-nav'])[2]"));
        Thread.sleep(2000);
        dropdown.click();

        WebElement logoutButton = driver.findElement(By.xpath("//a[text()=' Logout']"));
        Thread.sleep(1000);
        logoutButton.click();

        // Print the iteration number for verification
        System.out.println("Login and Logout successful");
    }

	@AfterMethod
    public void tearDown() {
        // Close the browser after each test iteration
        if (driver != null) {
            driver.quit();
        }
    }
}
