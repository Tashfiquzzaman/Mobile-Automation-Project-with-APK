package com.it.Mobile_Automation;

import org.testng.annotations.Test;
import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

@Test
public class Product_Addto_Cart {
	
	public AndroidDriver driver;

    @SuppressWarnings("deprecation")
	@BeforeTest
    public void startApp() throws MalformedURLException, InterruptedException {
       //File f = new File("src/test/resources");
       // File fs = new File(f, "General-Store.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("deviceName", "local");
        cap.setCapability("udid", "emulator-5554");
       // cap.setCapability("app", fs.getAbsolutePath());
       cap.setCapability("appPackage","com.androidsample.generalstore");
        cap.setCapability("appActivity","com.androidsample.generalstore.SplashActivity");
        driver = new AndroidDriver( new URL("http://0.0.0.0:4723/wd/hub"), cap);
        TimeUnit.SECONDS.sleep(3);
        
       
        
        //driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("TEST TEXT");
    } 
    public void runApp() throws InterruptedException{
    	driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.androidsample.generalstore:id/nameField\"]")).sendKeys("Test");
    	TimeUnit.SECONDS.sleep(1);
    	driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
    	TimeUnit.SECONDS.sleep(2);
    	driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnLetsShop\"]")).click();
    	TimeUnit.SECONDS.sleep(3);
    	driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]"));
    	 WebElement element = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart'])[1]"));
         element.click();
         TimeUnit.SECONDS.sleep(3);
         
         WebElement addtocart= driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id=\"com.androidsample.generalstore:id/appbar_btn_cart\"]"));
         addtocart.click();
         TimeUnit.SECONDS.sleep(2);
        		 
    	
//        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
//     // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Bangladesh\"));");
//        driver.findElement(By.xpath("//android.widget.TextView[@text='Bangladesh']")).click();
//        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("TEST TEXT");
    }
    @AfterTest
    public void removeApp(){
        driver.removeApp("com.androidsample.generalstore");
    }
	
	
}
