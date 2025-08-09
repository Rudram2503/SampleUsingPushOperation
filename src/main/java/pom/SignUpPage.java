package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import genericLibraries.WebDriverUtilites;

public class SignUpPage {
    WebDriver driver;
    WebDriverUtilites utils = new WebDriverUtilites();

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    // Step 1: Click on profile icon
    public void clickProfileIcon() {
        driver.findElement(By.xpath("//*[@id='shopify-section-sections--24442057392416__header']/div/div/div/div/div/ul/li[2]/a/span[2]")).click();
    }

    // Step 2: Click on Sign Up link
    public void clickSignUpLink() {
        driver.findElement(By.xpath("//*[@id='login-form-container']/div[1]/div/div/a[2]")).click();
    }

    // Step 3: Fill the form fields
    public void fillSignUpForm(String firstName, String lastName, String dob, String email, String mobile, String gender, String password) {
        driver.findElement(By.id("customer[first_name]")).sendKeys(firstName);
        driver.findElement(By.id("customer[last_name]")).sendKeys(lastName);
        driver.findElement(By.id("dob")).sendKeys(dob);
        driver.findElement(By.id("customer[email]")).sendKeys(email);
        driver.findElement(By.id("phone")).sendKeys(mobile);

        // Select gender from dropdown
        WebElement genderDropdown = driver.findElement(By.id("gender"));
        utils.dropDown(genderDropdown, gender);

        driver.findElement(By.id("customer[password]")).sendKeys(password);
    }

    // Step 4: Click on Create Account button
    public void clickCreateAccount() {
        driver.findElement(By.xpath("//*[@id='submit-button']/span[1]")).click();
    }

    // Step 5: Verify successful account creation
    public boolean verifyAccountCreation() {
        return driver.getPageSource().contains("Thank you for registering")
            || driver.getPageSource().contains("Account Created");
    }
}
