package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import genericLibraries.WebDriverUtilites;

public class HomePage {
    WebDriver driver;
    WebDriverUtilites utils = new WebDriverUtilites();

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
 // Scroll and click on the specific image
    public void clickFeaturedImage() {
        WebElement featuredImage = driver.findElement(By.xpath("//*[@id='shopify-section-template--24442062602528__e46d4322-2f82-4076-9c1f-7ed581f82dbb']/div/div/div/div[1]/a/img"));
        utils.scroll(driver, featuredImage); // Scroll to bring the image into view
        featuredImage.click();
    }

    // Scroll and click on the first product image
    public void clickFirstProductImage() {
        WebElement firstProductImage = driver.findElement(By.xpath("//*[@id='facet-main']/product-list/div/product-item[1]/div[3]/div/div[1]/a"));
        utils.scroll(driver, firstProductImage); // Scroll to bring the image into view
        firstProductImage.click();
    }

    // Click on Add to Cart button
    public void clickAddToCart() {
        WebElement addToCartButton = driver.findElement(By.xpath("//*[@id='Add To Bag']/span[1]/text()"));
        addToCartButton.click();
    }

    // Verify if item was added to cart (basic check)
    public boolean verifyItemAddedToCart() {
        return driver.getPageSource().contains("added to your cart") || driver.getPageSource().contains("View Cart");
    }
}
