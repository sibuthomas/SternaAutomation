package com.sterna.automation;

import org.testng.annotations.Test;

public class ConfigurationTestCasesNegativeScenarios extends TestBase {

	@Test(description = "Validate the Key revalidation time Field" , priority = 1)
	public void ValidateKeyValidationTimeField() {
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("Key revalidation time");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("Key revalidation time");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("Key revalidation time", "1");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("Key revalidation time");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
			
	  }

		@Test(description = "Validate the Terminal filling time Field" ,priority = 2)
		public void TerminalFillingTimeField(){
		  pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("Terminal filling time");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("Terminal filling time");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("Terminal filling time", "1");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("Terminal filling time");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		}
		
		@Test(description = "Validate the KeyReturnTimeField",priority = 3) 
		public void KeyReturnTimeField(){
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();	  
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("Key return time");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("Key return time");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("Key return time", "1");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("Key return time");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		}
		
		@Test(description = "Validate the Keybox Door Close Time Field",priority = 4) 
		public void KeyboxDoorCloseTimeField(){
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();	  
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("Keybox door closetime");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("Keybox door closetime");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("Keybox door closetime", "1");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("Keybox door closetime");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		} 
		
		@Test(description = "Validate the Keybox Door Open Time Field",priority = 5) 
		public void KeyboxDoorOpenTimeField(){
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();	  
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("Keybox door opentime");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("Keybox door opentime");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("Keybox door opentime", "1");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("Keybox door opentime");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		}  
		
		@Test(description = "Validate the Keybox HB Duration Time Field", priority = 6) 
		public void KeyboxHBDurationTimeField(){
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();	  
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("Keybox HB duration");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("Keybox HB duration");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("Keybox HB duration", "1");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("Keybox HB duration");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		}
		@Test(description = "Validate the Keybox HooterEnabled Field", priority = 7) 
		public void KeyboxhooterEnabledField(){
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();	  
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("Keybox hooter enabled");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("Keybox hooter enabled");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("Keybox hooter enabled", "yes");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("Keybox hooter enabled");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		}
		@Test(description = "Validate the Keybox TurnTime Field", priority = 8) 
		public void KeyboxTurnTimeField(){
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();	  
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("Keybox turn time");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("Keybox turn time");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("Keybox turn time", "1");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("Keybox turn time");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		} 
		@Test(description = "Validate the OTP Count Field", priority = 9) 
		public void OTPCountField(){
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();	  
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("OTP count");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("OTP count");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("OTP count", "10");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("OTP count");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		} 
		@Test(description = "Validate the Radius Field", priority = 10) 
		public void RadiusField(){
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();	  
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("Radius");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("Radius");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("Radius", "1");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("Radius");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		}	
		@Test(description = "Validate the Swipe In Repeat Count Field", priority = 11) 
		public void SwipeInRepeatCountField(){
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();	  
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("Swipe in");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("Swipe in");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("Swipe in", "10");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("Swipe in");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		}
		@Test(testName = "Validate the Swipe Out Repeat Count Field", priority = 12) 
		public void SwipeOutRepeatCountField(){
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();	  
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("Swipe out");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("Swipe out");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("Swipe out", "10");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("Swipe out");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		}
		@Test(description = "Validate the VTS OFF Line Time Field", priority = 13) 
		public void VTSOffLineTimeField(){
		pageFactoryManager.get().getLoginPage().loadLoginPage();
		pageFactoryManager.get().getLoginPage().enterUsername("Prakash");
		pageFactoryManager.get().getLoginPage().enterPassword("Prakash@123");
		pageFactoryManager.get().getLoginPage().clickSignInBtn();	  
		pageFactoryManager.get().getDashBoardPage().clickOnConfigurationMenuItem();
		pageFactoryManager.get().getConfigurationPage().enterSearchText("VTS offline time");
		pageFactoryManager.get().getConfigurationPage().clickOnGoBtn();
		pageFactoryManager.get().getConfigurationPage().clickToEditCurrentValueOfItem("VTS offline time");
		pageFactoryManager.get().getConfigurationPage().enterNewValueToCurrentItem("VTS offline time", "150");
		pageFactoryManager.get().getConfigurationPage().clickSubmitToUpdate("VTS offline time");
		pageFactoryManager.get().getConfigurationPage().clickAlertOKButton();
		pageFactoryManager.get().getDashBoardPage().clickOnLogout();
		}
	
		
}
