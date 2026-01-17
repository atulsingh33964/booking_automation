package tests;

import base.BaseTest;
import com.microsoft.playwright.ElementHandle;
import org.junit.jupiter.api.Test;
import pages.BookingPage;

import java.nio.file.Paths;
import java.util.List;

public class BookingTest extends BaseTest {

    @Test
    public void hotelSearchFlow() {

        // Navigate to Booking website
        page.navigate(BookingPage.URL);

        // Wait for search box and enter destination
        page.waitForSelector(BookingPage.SEARCH_BOX);
        page.fill(BookingPage.SEARCH_BOX, "Goa, India");

        // Click search button
        page.click(BookingPage.SEARCH_BUTTON);

        // Wait for hotel cards to load
        page.waitForSelector(BookingPage.HOTEL_CARD);

        // Fetch all hotel listings
        List<ElementHandle> hotels =
                page.querySelectorAll(BookingPage.HOTEL_CARD);

        // Print hotel names
        for (ElementHandle hotel : hotels) {
            String name =
                    hotel.querySelector(BookingPage.HOTEL_NAME).innerText();
            System.out.println("Hotel: " + name);
        }

        // Take screenshot for proof
        page.screenshot(new com.microsoft.playwright.Page.ScreenshotOptions()
                .setPath(Paths.get("screenshots/final.png")));
    }
}
