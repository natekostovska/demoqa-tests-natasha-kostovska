package com.demoqa.tests;

import org.testng.annotations.Test;

public class WindowsPageTests extends BaseTest{

    @Test
    public void open_tab(){
        driver.navigate().to(URL7);
        System.out.println("OLD WINDOW: " + windowsPage.getCurrentTab());
        windowsPage.click_new_tab();
        System.out.println("FOCUS WINDOW: " + windowsPage.getCurrentTab());
        System.out.println("ALL WINDOWS: " + windowsPage.get_all_tabs());
        windowsPage.switch_to_tab(windowsPage.get_all_tabs(), 1);
        System.out.println("CURRENT WINDOW: " + windowsPage.getCurrentTab());
        windowsPage.switch_to_tab(windowsPage.get_all_tabs(), 0);
        catc();
    }
}
