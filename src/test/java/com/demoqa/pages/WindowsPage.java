package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Set;

public class WindowsPage {
    WebDriver driver;
    WebDriverWait wait;

    By newTab = By.xpath("//*[@id=\"tabButton\"]");

    public WindowsPage(WebDriver driver, WebDriverWait wait) {

        this.driver = driver;
        this.wait = wait;

    }

    public void switch_to_tab(ArrayList<String> tab, int index) {
        driver.switchTo().window(tab.get(index));
    }

    public String getCurrentTab() {
        return driver.getWindowHandle();
    }

    public ArrayList<String> get_all_tabs() {
        return new ArrayList<String>(driver.getWindowHandles());
    }

    public void click_new_tab() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newTab)).click();
    }

}
