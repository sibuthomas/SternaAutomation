package com.sterna.automation.setup;

import org.openqa.selenium.WebDriver;

public class TLDriverFactory {
	static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();

	public synchronized static void setTLDriver(WebDriver driver) {
		threadLocal.set(driver);
	}

	public synchronized static WebDriver getTLDriver() {
		return threadLocal.get();
	}

	public synchronized static void removeTLDriver() {
		threadLocal.remove();
	}
}
