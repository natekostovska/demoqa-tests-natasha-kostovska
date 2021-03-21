package com.demoqa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PractiseFormTests extends BaseTest {


    @Test
    public void test1() {
        driver.navigate().to(URL5);
        practiceForm.getTitle();
        catc();
    }


    @Test
    public void popolniForma() {
        driver.navigate().to(URL5);
        practiceForm.name("Natasha");
        practiceForm.surname("Kostovska");
        practiceForm.eMail("nate_kostovska_4@outlook.com");
        practiceForm.gender(1);
        practiceForm.mobileNumber("1234567891");
        practiceForm.dateOfBirth("12 Oct 1995");
        practiceForm.hobbies(0);
        practiceForm.hobbies(1);
        practiceForm.currentAddress("Skopje");
        // go pominuva ako stavime drug grad od dadedni ama kazhuva no option
        practiceForm.state("NCR");
        practiceForm.city("Delhi");
        practiceForm.submit();
        Assert.assertEquals(practiceForm.studentName(), "Natasha Kostovska");
        Assert.assertEquals(practiceForm.studentEmail(), "nate_kostovska_4@outlook.com");
        Assert.assertEquals(practiceForm.studentGender(), "Female");
        Assert.assertEquals(practiceForm.studentMobile(), "1234567891");
        Assert.assertEquals(practiceForm.studentDate(),"12 October,1995");
        Assert.assertEquals(practiceForm.studentHobbies(), "Sports, Reading");
        Assert.assertEquals(practiceForm.studentAddress(), "Skopje");
        Assert.assertEquals(practiceForm.studentStateAndCity(), "NCR Delhi");
    catc();

    }

}
