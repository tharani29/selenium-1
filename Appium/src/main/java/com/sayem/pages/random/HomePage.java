package com.sayem.pages.random;

import com.sayem.pages.myexpert.MyExpertPage;
import com.sayem.pages.mygoal.MyGoalPage;
import com.sayem.pages.mymoney.MyMoneyPage;
import com.sayem.pages.myreads.MyReadsPage;
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

    public MyMoneyPage goToMoneyCenter(){
        moneyCenter.click();
        return PageFactory.initElements(driver, MyMoneyPage.class);
    }

    public MyGoalPage goToMyGoal(){
        learnVestArticles.click();
        return PageFactory.initElements(driver, MyGoalPage.class);
    }

    public MyReadsPage goToLearnVestArticles(){
        learnVestArticles.click();
        return PageFactory.initElements(driver, MyReadsPage.class);
    }

    public MyExpertPage goToFinancialConsultation(){
        financialConsultation.click();
        return PageFactory.initElements(driver, MyExpertPage.class);
    }

    public SettingsPage goToSettingsPage(){
        Settings.click();
        return PageFactory.initElements(driver, SettingsPage.class);
    }
}
