package com.sayem.pages.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile2Page {

    private WebDriver driver;

    public Profile2Page(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(name = "Budget Better")
    private WebElement budgetBetter;

    @FindBy(name = "Save More")
    private WebElement saveMore;

    @FindBy(name = "Retire Well")
    private WebElement retireWell;

    @FindBy(name = "Pay Off Cards")
    private WebElement payOffCards;

    @FindBy(name = "Buy a House")
    private WebElement buyAHouse;

    @FindBy(name = "Deal with Loans")
    private WebElement dealWithLoans;

    @FindBy(name = "Invest Wisely")
    private WebElement investWisely;

    @FindBy(name = "Earn More")
    private WebElement earnMore;

    @FindBy(name = "Next")
    private WebElement nextButton;


    public Profile3Page selectBudget(){
        retireWell.click();
        payOffCards.click();
        budgetBetter.click();
        nextButton.click();

        return PageFactory.initElements(driver, Profile3Page.class);

    }
}
