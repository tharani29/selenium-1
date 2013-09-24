package com.sayem.testcases.userlookup;

import com.sayem.pages.HomePage;
import com.sayem.testcases.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchForUser extends TestBase{

    @Test
    public void resetPassword(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        // Go to configurations => config.properties to change URL, Email, Password etc.
        homePage.takeMeToLoginPage().logMeInToAdminPanel(loginEmail, loginPassword)
                .takeMeToUserLookUpDashboard();
    }

}
