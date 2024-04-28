package com.cydeo.tests.homework;

import com.cydeo.utils.BrowserUtils;
import com.cydeo.utils.ConfigurationReader;
import com.cydeo.utils.Driver;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegistrationForm {
    @BeforeEach
    public void setupMethod(){
        //1. Open browser
        //2. Go to website:https://practice.cydeo.com/registration_form
        Driver.getPage().navigate(ConfigurationReader.getProperty("registrationUrl"));

    }

    @AfterEach
    void tearDown() {

        BrowserUtils.sleepWithThread(3);
        Driver.closeDriver();
    }


    @Test
    public void registration_form(){
        //3. Enter first name
Page page = Driver.getPage();
page.getByPlaceholder("first name").fill("testFirst");
        //4. Enter last name
        page.getByPlaceholder("last name").fill("testLast");

        //5. Enter username
        page.getByPlaceholder("username").fill("usernameTest");

        //6. Enter email address
        BrowserUtils.sleepWithThread(3);
        page.getByPlaceholder("email@email.com").fill("emai@email.com");

        //7. Enter password
        page.locator("[name='password']").fill("passwordum");

        //8. Enter phone number
        page.locator("[name='phone']").fill("passwordum");

        //9. Select a gender from radio buttons
page.getByRole(AriaRole.RADIO, new Page.GetByRoleOptions().setName("female"));
BrowserUtils.sleepWithThread(3);

        //10.Enter date of birth


        //11.Select Department/Office

        //departmentDropdown.selectByVisibleText("Department of Engineering");


        //12.Select Job Title


        //13.Select programming language from checkboxes


        //14.Click to sign up button

        //15.Verify success message “You’ve successfully completed registration.” is displayed.



    }


}
