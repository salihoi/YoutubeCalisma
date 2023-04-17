package com.pages;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class video_sayfası extends BasePage {

    WebDriverWait wait = new WebDriverWait(Driver.get(), 10);

    @FindBy(xpath = "//a[@title='MongoDB Database Skills (Sia Cheap Thrills Parody)']")
    public WebElement videolink;

    @FindBy(xpath = "//h1[@class='style-scope ytd-watch-metadata']")
    public WebElement videoisim;

    @FindBy(xpath = "//div[@class='ytp-ad-text ytp-ad-skip-button-text']")
    public WebElement reklamBtn;

    @FindBy(xpath = "//button[@title='Tam ekran (f)']")
    public WebElement tamEkran;

    @FindBy(xpath = "//button[@title='Sessiz (m)']")
    public WebElement sesiAzalt;


    public void Reklam() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 262);
        WebElement skipAdButton = wait.until(ExpectedConditions.elementToBeClickable(reklamBtn));
        skipAdButton.click();
        BrowserUtils.waitFor(242);

    }

    public void Ses(){
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(sesiAzalt).perform();
        BrowserUtils.waitFor(2);

    }
}