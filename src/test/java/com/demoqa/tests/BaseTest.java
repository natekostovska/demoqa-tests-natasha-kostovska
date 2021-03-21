package com.demoqa.tests;

import com.demoqa.framework.Browser;
import com.demoqa.pages.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String brs = "chrome";
    //public String firefoxBrowser="gecko";
    public static final String URL = "https://demoqa.com/links";
    public static final String URL2 = "https://demoqa.com/buttons";
    public static final String URL3 = "https://demoqa.com/radio-button";
    public static final String URL4 = "https://demoqa.com/checkbox";
    public static final String URL5 = "https://demoqa.com/automation-practice-form";
    public static final String URL6 = "https://demoqa.com/select-menu";
    public static final String URL7 = "https://demoqa.com/browser-windows";


    public LinksPage linksPage;
    Browser browser = new Browser();

    public ButtonsPage buttonsPage;
    public RadioButtonPage radioButtonPage;
    public CheckBoxPage checkBoxPage;
    public PracticeForm practiceForm;
    public SelectMenu selectMenu;
    public WindowsPage windowsPage;
    public TextBoxPage textBoxPage;

    @BeforeMethod
    public void set_up() {
        driver = browser.open(this.brs);
        // driver=browser.open(this.firefoxBrowser);

        Dimension dimension = new Dimension(200, 300);
        driver.manage().window().setSize(dimension);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);

        linksPage = new LinksPage(driver, wait);
        buttonsPage = new ButtonsPage(driver, wait);
        radioButtonPage = new RadioButtonPage(driver, wait);
        checkBoxPage = new CheckBoxPage(driver, wait);
        practiceForm = new PracticeForm(driver, wait);
        selectMenu = new SelectMenu(driver, wait);
        windowsPage = new WindowsPage(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);

    }

    public void catc() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
    }


    @AfterMethod
    public void tear_down() {
        driver.quit();
    }

}
