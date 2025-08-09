package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import genericLibraries.BaseClass;
import pom.HomePage;

public class HomepageTest2 extends BaseClass {
    @Test
    public void verifyAddProductToCart() {
        HomePage homepage = new HomePage(driver);

        // Step 1: Scroll down and click on featured image
        homepage.clickFeaturedImage();

        homepage.clickFirstProductImage();
        // Step 3: Click Add to Cart
        homepage.clickAddToCart();

        // Step 4: Assert item added to cart
        Assert.assertTrue(homepage.verifyItemAddedToCart(), "Item was not added to cart!");
    }
}
