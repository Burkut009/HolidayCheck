package de.holdidaycheck.pages;

import de.holdidaycheck.utilities.BrowserUtils;
import de.holdidaycheck.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "//input[@id='search-input']")
    public WebElement searchbox;

    @FindBy(xpath = "//input[@placeholder='Wohin?']")
    public WebElement inputbox;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/ul/li[1]/a/div/div[2]/div[1]/span")
    public WebElement firstsuggested;


    @FindBy(xpath = "//*[@id=\"hotel-list\"]/div[1]/div/div/div/div[2]/span")
    public List<WebElement> searchResult;



    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }


}
