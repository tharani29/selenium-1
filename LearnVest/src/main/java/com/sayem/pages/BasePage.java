package com.sayem.pages;

import com.sayem.interfaces.IClick;
import org.openqa.selenium.support.ui.LoadableComponent;

public abstract class BasePage extends LoadableComponent<BasePage>{

    IClick click;

    public void performClick(IClick click) {
        this.click = click;
    }



}
