package com.jitu.landingpage;

import com.jitu.common.BaseTest;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TC-LP-04 | Metrics / trust strip")
public class TC_LP_04_MetricsTrustStrip extends BaseTest {

    @BeforeEach
    void openSite() {
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://jitu.one");
    }

    /**
     * Scrolls the metrics strip into the viewport and waits until its getText()
     * is non-blank. Elements below the fold report empty text until the browser
     * has painted them; scrolling first forces that paint.
     */
    private WebElement scrollAndAwaitMetricsText() {
        WebElement strip = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("div[class*='_statsBar']")));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({behavior:'instant', block:'center'});", strip);

        return wait.until(d -> {
            WebElement el = d.findElement(By.cssSelector("div[class*='_statsBar']"));
            String text = el.getText();
            return (text != null && !text.isBlank()) ? el : null;
        });
    }

    @Test
    @DisplayName("LP-021 | Key metrics visible")
    void LP_021_keyMetricsVisible() {
        WebElement metricsStrip = scrollAndAwaitMetricsText();

        assertTrue(metricsStrip.isDisplayed(), "Metrics strip should be visible on the page");

        String metricsText = metricsStrip.getText();

        assertTrue(metricsText.contains("5+"),
                "Metric '5+' (test types) should be visible in the strip");
        assertTrue(metricsText.contains("<10s"),
                "Metric '<10s' (generation speed) should be visible in the strip");
        assertTrue(metricsText.contains("CSV"),
                "Metric 'CSV' (export format) should be visible in the strip");
        assertTrue(metricsText.contains("HALLUCINATIONS"),
                "Metric '0 Hallucinations / Rule-based only' should be visible in the strip");
    }

    @Test
    @DisplayName("LP-022 | Metric copy accuracy")
    void LP_022_metricCopyAccuracy() {
        WebElement metricsStrip = scrollAndAwaitMetricsText();

        assertTrue(metricsStrip.isDisplayed(), "Metrics strip should be present for copy review");

        List<WebElement> metricItems = metricsStrip.findElements(
                By.cssSelector("[class*='_statItem']"));

        System.out.println("=== LP-022 Metric Copy Audit ===");
        System.out.println("Total metric items found: " + metricItems.size());
        for (int i = 0; i < metricItems.size(); i++) {
            System.out.println("Metric [" + (i + 1) + "]: " + metricItems.get(i).getText());
        }
        System.out.println("Full strip text:\n" + metricsStrip.getText());
        System.out.println("=== End of audit — manual review required ===");

        assertFalse(metricsStrip.getText().isBlank(),
                "Metrics strip should contain visible copy — was blank/empty");
    }

}
