package tests;

import base.BaseTest;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class BookingTest extends BaseTest {

    @Test
    public void hotelSearchFlow() {

        page.navigate("https://www.booking.com");

        page.waitForSelector("input[name='ss']");
        page.fill("input[name='ss']", "Goa, India");

        page.click("button[type='submit']");
        page.waitForSelector("[data-testid='property-card']");

        List<ElementHandle> hotels =
                page.querySelectorAll("[data-testid='property-card']");

        for (ElementHandle hotel : hotels) {
            String name = hotel.querySelector("[data-testid='title']").innerText();
            System.out.println("Hotel: " + name);
        }

        page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get("screenshots/final.png")));
    }
}
