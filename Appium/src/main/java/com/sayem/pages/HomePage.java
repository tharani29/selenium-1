package com.sayem.pages;

import com.sayem.pages.financialconsultation.FinancialConsultationPage;
import com.sayem.pages.learnvestarticles.LearnvastArticlesPage;
import com.sayem.pages.moneycenter.MoneyCenterPage;
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

    public FinancialConsultationPage goToFinancialConsultation(){
        financialConsultation.click();
        return PageFactory.initElements(driver, FinancialConsultationPage.class);
    }

    public LearnvastArticlesPage goToLearnVestArticles(){
        learnVestArticles.click();
        return PageFactory.initElements(driver, LearnvastArticlesPage.class);
    }

    public SettingsPage goToSettingsPage(){
        Settings.click();
        return PageFactory.initElements(driver, SettingsPage.class);
    }
}
