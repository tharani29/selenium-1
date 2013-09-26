package com.sayem.testcases;

import com.sayem.pages.Dashboard;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{


    @BeforeMethod
    public void setUp() throws Exception {
        initDriver();
    }


    @Test
    protected void testUIComputation() throws Exception {

        String emailAddress = "sayem@ilearnvest.com";
        String password = "user1234";

        Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
        dashboard.signUpAndLogin().login().loginIn(emailAddress, password);
    }
}
