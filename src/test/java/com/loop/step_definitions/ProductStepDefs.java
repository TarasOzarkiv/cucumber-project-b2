package com.loop.step_definitions;

import com.loop.pages.ProductPage;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.bouncycastle.est.LimitedSource;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ProductStepDefs {

    ProductPage productPage = new ProductPage();

    @Given("User is on the HomePage")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("product.url"));
    }
    @Then("User should be able to see expected prices in following products")
    public void user_should_be_able_to_see_expected_prices_in_following_products(List<Map<String, String>> productDetails) throws InterruptedException {
        for(Map<String, String> productDetail : productDetails){
//            System.out.println("=============Product Detail===============");
//            productDetail.get("productDetail.get(\"Category\") = " + productDetail.get("Category"));
//            productDetail.get("productDetail.get(\"Product\") = " + productDetail.get("Product"));
//            productDetail.get("productDetail.get(\"expectedPrice\") = " + productDetail.get("expectedPrice"));

            productPage.clickCategory(productDetail.get("Category"));

            String actual = productPage.getProductPrice(productDetail.get("Product"));

            String expectedPrise = productDetail.get("expectedPrice");

            assertEquals(expectedPrise, actual);


//            productPage.clickCategory(productDetail.get("expectedPrice"));

        }
    }
    @Then("User should be able to see expected prices in following products with listOflist")
    public void user_should_be_able_to_see_expected_prices_in_following_products_with_list_oflist(List<List<String>> productDetails) throws InterruptedException {

        for (List<String> productDetail : productDetails){
            productPage.clickCategory(productDetail.get(0));

            String actualPrice = productPage.getProductPrice(productDetail.get(1));

            String expectedPrice = productDetail.get(2);

            assertEquals(expectedPrice, actualPrice);
        }


    }

}