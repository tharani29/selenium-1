package org.sayem.pages;

import org.openqa.selenium.By;
import org.sayem.Browser;
import org.sayem.selectors.Id;
import org.sayem.selectors.Xpath;
import org.testng.Assert;

import java.util.UUID;

/**
 * Created by sayem on 12/4/15.
 */
public class RegisterPage implements Browser<RegisterPage> {

    public RegisterPage createAnAccount() {
        String uuid = UUID.randomUUID().toString();
        String successMessage = "Thank you for registering with Madison Island.";

        sendBy(Id.FIRST_NAME, "Syed");
        sendBy(Id.LAST_NAME, "Sayem");
        sendBy(Id.EMAIL_ADDRESS, "syed" + uuid + "@gmail.com");
        select(Id.GENDER, "Male");
        sendBy(Id.PASSWORD, "user123");
        sendBy(Id.PASSWD_CONFIRM, "user123");
        button(Xpath.REGISTER_BTN).click();
        String element = findElement(By.cssSelector(".success-msg>ul>li>span")).getText();
        Assert.assertEquals(element, successMessage);
        return this;
    }
}
