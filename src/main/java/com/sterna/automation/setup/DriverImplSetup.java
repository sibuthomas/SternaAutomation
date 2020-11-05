package com.sterna.automation.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverImplSetup extends DriverManager {

	@Override
	protected WebDriver createWebDriver() {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-infobars");
	    options.addArguments("--disable-popup-blocking");
	    options.setAcceptInsecureCerts(true);
	    options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	    WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver;
	}
}
