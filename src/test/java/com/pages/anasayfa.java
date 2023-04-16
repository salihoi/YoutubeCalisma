package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class anasayfa extends BasePage{

@FindBy(xpath = "//input[@placeholder='Ara']")
public WebElement arama;

@FindBy(xpath = "//button[@class='style-scope ytd-searchbox']")
    public WebElement arama_btn;


}
