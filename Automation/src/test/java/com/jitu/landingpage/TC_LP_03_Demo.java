package com.jitu.landingpage;

import com.jitu.common.BaseTest;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions; // [ADDED] needed for explicit wait conditions
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TC-LP-03 | Demo / output preview block")
public class TC_LP_03_Demo extends BaseTest {

    @BeforeEach
    void openSite() {
        driver.get("https://jitu.one");
    }

    @Test
    @DisplayName("LP-010 |  Demo panel shows sample output ")
    void LP_010_DemoPanelShowsSampleOutput(){
        // [CHANGED] wait until element is visible before reading text (page renders content dynamically)
        WebElement heroHeadline = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class*='_heroTitle']"))
        );
        assertTrue(heroHeadline.getText().contains("Write"));
    }

    @Test
    @DisplayName("LP-011| Demo reflects product promise")
    void LP_011_DemoReflectsProductPromise() {
        // [CHANGED] wait until element is visible before reading text (page renders content dynamically)
        WebElement Subhero = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class*='_heroTagline']"))
        );
        assertTrue(Subhero.getText().contains("From"));
    }

}