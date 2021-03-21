package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {

    WebDriver driver;
    WebDriverWait wait;

    public TextBoxPage(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }

    By fullName= By.xpath("//*[@id=\"userName\"]");
    By mail=By.xpath("//*[@id=\"userEmail\"]");
    By currentAddress=By.xpath("//*[@id=\"currentAddress\"]");
    By permanentAddress=By.xpath("//*[@id=\"permanentAddress\"]");
    By submit=By.xpath("//*[@id=\"submit\"]");

    public void enterFullName(String credentials){
        wait.until(ExpectedConditions.visibilityOfElementLocated(fullName)).sendKeys(credentials);
    }

    public void enterMail(String eMail){
        wait.until(ExpectedConditions.visibilityOfElementLocated(mail)).sendKeys(eMail);
    }

    public void enterCAddress(String address){
        wait.until(ExpectedConditions.visibilityOfElementLocated(currentAddress)).sendKeys(address);
    }

    public void enterPAddress(String address){
        wait.until(ExpectedConditions.visibilityOfElementLocated(permanentAddress)).sendKeys(address);
    }

    public void clickSubmit(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(submit)).click();
    }
}
