package com.vtiger.comcast.generalUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
/**
 * 
 * @author Chinmaya
 *
 */
public class LisImplementClass implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		
		EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.sDriver);
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./screenshots/"+methodName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
