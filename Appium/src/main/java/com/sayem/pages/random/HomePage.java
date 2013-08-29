package com.sayem.pages.random;

import com.sayem.pages.myexpert.MyExpertPage;
import com.sayem.pages.myreads.MyReadsPage;
import com.sayem.pages.mymoney.MoneyCenterPage;
import com.sayem.pages.settings.SettingsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//window[1]/button[1]")
    private WebElement moneyCenter;

    @FindBy(xpath = "//window[1]/button[3]")
    private WebElement financialConsultation;

    @FindBy(xpath = "//window[1]/button[6]")
    private WebElement learnVestArticles;

    @FindBy(name = "Settings")
    private WebElement Settings;

    public MoneyCenterPage goToMoneyCenter(){
        moneyCenter.click();
        return PageFactory.initElements(driver, MoneyCenterPage.class);
    }

    public MyExpertPage goToFinancialConsultation(){
        financialConsultation.click();
        return PageFactory.initElements(driver, MyExpertPage.class);
    }

    public MyReadsPage goToLearnVestArticles(){
        learnVestArticles.click();
        return PageFactory.initElements(driver, MyReadsPage.class);
    }

    public SettingsPage goToSettingsPage(){
        Settings.click();
        return PageFactory.initElements(driver, SettingsPage.class);
    }
}
