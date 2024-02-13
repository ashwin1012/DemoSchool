package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginLogoutTestCaseInLoop1000Times {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");

        for (int i = 1; i <= 1000; i++) {
            WebDriver driver = new ChromeDriver(options);
            try {
                executeLoginLogoutTest(driver, i);
            } catch (Exception e) {
                e.printStackTrace();
                // Handle specific exceptions as needed
            } finally {
                // Close the browser after each iteration
                if (driver != null) {
                    driver.quit();
                }
            }
        }
    }

    public static void executeLoginLogoutTest(WebDriver driver, int iteration) throws InterruptedException {
        String baseURL = "https://schooldemostand-dot-iknotwebpage.el.r.appspot.com/";
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
        System.out.println("Iteration " + iteration + ": Login and Logout successful");
    }
}
