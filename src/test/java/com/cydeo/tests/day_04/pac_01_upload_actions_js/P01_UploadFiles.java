package com.cydeo.tests.day_04.pac_01_upload_actions_js;

import com.cydeo.utils.*;
import org.junit.jupiter.api.*;
import java.nio.file.Path;

public class P01_UploadFiles {
    @BeforeEach
    void setUp() {
        Driver.getPage().navigate("https://practice.cydeo.com/upload");
    }

    @Test
    void test1() {
        String pathOfFile = System.getProperty("user.dir") + "/src/test/resources/test.txt";
        Driver.getPage().getByTestId("file-upload").setInputFiles(Path.of(pathOfFile));
        BrowserUtils.sleepWithThread(3);
        Driver.getPage().getByTestId("file-submit").click();
        System.out.println(Driver.getPage().locator("//h3").textContent());

    }

    @AfterEach
    void tearDown() {
        Driver.closeDriver();
    }
}
