package com.demoqa.tests;

import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest{

    @Test
    public void prv(){
        driver.navigate().to("https://demoqa.com/text-box");
        textBoxPage.enterFullName("Natasha Kostovska");
        textBoxPage.enterMail("nate_kostovska_4@outlook.com");
        textBoxPage.enterCAddress("Skopje");
        textBoxPage.enterPAddress("Skopje,NM");
        textBoxPage.clickSubmit();

        catc();
    }
}
