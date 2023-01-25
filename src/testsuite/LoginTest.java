package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginTest extends BaseTest {
    String baseurl = "https://www.saucedemo.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValid() {
        //enter email id and password field
        WebElement usernamefield =driver.findElement(By.xpath("//input[@id='user-name']"));
        usernamefield.sendKeys("standard_user");
        WebElement passwordfield = driver.findElement(By.xpath("//input[@id='password']"));
        passwordfield.sendKeys("secret_sauce");
        WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginbutton.click();
        WebElement productfield = driver.findElement(By.xpath("//div[@class='inventory_container']"));
        productfield.click();

    }




}

